package com.mt

class PrincipalController {

    def index() {

	respond([nombre: session.nombre ?: 'Usuario', facturasTotal: Factura.count() ])	
    }

    def updateUsuario(String nombre){
	session.nombre =  nombre
	flash.mensaje = "Name has been updated" 
	redirect action: 'index' 

    }
}
