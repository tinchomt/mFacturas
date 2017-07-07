package com.mt

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller:"principal")
        
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
