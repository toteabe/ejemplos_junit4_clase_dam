package org.iesvdm.junit.business;

import java.util.List;

import org.iesvdm.junit.business.exception.DifferentCurrenciesException;
import org.iesvdm.junit.model.Amount;
import org.iesvdm.junit.model.Product;


/**
 * 
 * Esto es un mensaje para probar sincronización con git...
 */
public interface ClientBO {

	Amount getClientProductsSum(List<Product> products)
			throws DifferentCurrenciesException;

}