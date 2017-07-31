package com.mt

class BootStrap {

    def init = { servletContext ->
	
	def pendiente = new Estado(nombre: 'Pendiente').save()	
	def pagado = new Estado(nombre: 'Pagado').save()
 	def anulado = new Estado(nombre: 'Anulado').save()
 	def cancelado = new Estado(nombre: 'Cancelado').save()
	
	// def cliente1 = new Cliente(cuit:'20278985866', razonSocial:'Cliente A', domicilio:'Ducasse 1027', descripcion:'Prueba').save()
	

    }

 def destroy = {
    }
}
