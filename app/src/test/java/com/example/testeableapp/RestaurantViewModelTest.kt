package com.example.testeableapp

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Test
import org.junit.Assert.assertTrue

class RestaurantViewModelTest {

   /* @Test
    fun addItem_agregaProductoCorrectamente() {

        val viewModel = RestaurantViewModel()

        viewModel.addItem(1)

        assertEquals(1, viewModel.quantities.value[1])
    }

    @Test
    fun incrementItem_incrementaCantidad() {

        val viewModel = RestaurantViewModel()

        viewModel.addItem(1)
        viewModel.incrementItem(1)

        assertEquals(2, viewModel.quantities.value[1])
    }

    @Test
    fun decrementItem_eliminaProductoCuandoCantidadEsUno() {

        val viewModel = RestaurantViewModel()

        viewModel.addItem(1)

        viewModel.decrementItem(1)

        assertFalse(viewModel.quantities.value.containsKey(1))
    }
    @Test
    fun calcularTotalCorrectamente() {

        val viewModel = RestaurantViewModel()

        viewModel.addItem(1)

        assertEquals(5.50, viewModel.total.value, 0.01)
    }
    @Test
    fun placeOrderGeneraConfirmacion() {

        val viewModel = RestaurantViewModel()

        viewModel.addItem(1)

        viewModel.placeOrder()

        assertEquals(1, viewModel.confirmation.value?.itemCount)
    }*/

    @Test
    fun dismissConfirmationLimpiaPedido() {

        val viewModel = RestaurantViewModel()

        viewModel.addItem(1)

        viewModel.placeOrder()

        viewModel.dismissConfirmation()

        assertTrue(viewModel.quantities.value.isEmpty())
    }
}