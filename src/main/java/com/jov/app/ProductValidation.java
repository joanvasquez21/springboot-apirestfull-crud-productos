package com.jov.app;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.jov.app.entities.Product;

@Component
public class ProductValidation implements Validator {

	//1.-Para dar soporte a la clase que queremos validar
	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Product.class.isAssignableFrom(clazz);
	}

	 
	/** El target es el objeto product.
	 * target : es el objeto que se esta validando, en mi caso estoy casteando  a (Product)
	 * errors: es para registrarcualquier error de validacion que ocurra durante el proceso de validación
	 */
	@Override
	public void validate(Object target, Errors errors) {
		Product product = (Product) target;
		/**
	     * Este metodo 'ValidationUtils.rejectIfEmptyOrWhitespace' se utiliza para verificar si un campo específico (en este caso, el campo "name" del objeto Product) 
	     * esta vacio  o contiene solo espacios en blanco. 
	     * Si se encntra que el campo está vacío o contiene solo espacios en blanco, se registra un error utilizando el objeto errors.
		 * El primer argumento (errors) es el objeto Errors donde se registrarán los errores.
		 * El segundo argumento ("name") es la ruta del campo que se está validando en el objeto Product.
		 * El tercer argumento (null) es el código de error asociado a esta validación. 
		 * En este caso, parece que se está utilizando una clave de mensaje internacionalizado, como "NotEmpty.product.name", que podría traducirse a un mensaje de error específico.
		 */
		 
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name",  null, "es requerido!.");
		
		if(product.getDescription() == null || product.getDescription().isBlank()) {
			errors.rejectValue("description", "es requerido, por favor.");
		}
		if(product.getPrice() ==null) {
			errors.rejectValue("price",null, "no puede ser nulo, ok!.");
		}else if(product.getPrice() <500) {
			errors.rejectValue("price",null, "debe ser mayor o igual que 500");
		}
		
	}

}
