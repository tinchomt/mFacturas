package com.mt

@SuppressWarnings('GrailsDomainReservedSqlKeywordName')
class Factura {

	Integer numero
	Cliente cliente
	String detalle
	Integer monto
	Estado estado
	Date fechaEmicion
	Date fechaPago	
	Responsable responsable

    static constraints = {

	numero blank: false
	detalle blank: false
	monto blank: false

    }


}
