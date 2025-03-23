package com.example.trivialapp.model

class Pregunta {
    private val preguntasFaciles: MutableList<Respuesta> = mutableListOf(
        Respuesta("¿Cuál de los siguientes ingredientes se usa principalmente para hacer pasta?",
            "Harina de maíz", "Harina de trigo", "Azúcar", "Sal", "Harina de trigo"),
        Respuesta("¿Qué tipo de aceite se utiliza comúnmente para freír alimentos?",
            "Aceite de oliva", "Aceite de coco", "Aceite de girasol", "Aceite de sésamo", "Aceite de girasol"),
        Respuesta("¿Qué ingrediente principal lleva una ensalada César?",
            "Pepino", "Lechuga romana", "Tomate", "Zanahoria", "Lechuga romana"),
        Respuesta("¿En qué tipo de cocina es más común el uso de wasabi?",
            "Cocina italiana", "Cocina japonesa", "Cocina francesa", "Cocina mexicana", "Cocina japonesa"),
        Respuesta("¿Qué tipo de carne es la base de un plato como el 'steak tartar'?",
            "Cerdo", "Pollo", "Res", "Cordero", "Res"),
        Respuesta("¿Qué fruta es utilizada para hacer guacamole?",
            "Manzana", "Aguacate", "Plátano", "Naranja", "Aguacate"),
        Respuesta("¿Cuál de las siguientes es una bebida que se obtiene de la fermentación de uvas?",
            "Cerveza", "Vino", "Tequila", "Sidra", "Vino"),
        Respuesta("¿Cómo se llama el proceso de cocinar alimentos en agua hirviendo durante un corto período?",
            "Cocinar al vapor", "Hervir", "Escalfar", "Saltear", "Hervir"),
        Respuesta("¿Qué tipo de pasta se usa para preparar lasaña?",
            "Espaguetis", "Fettuccine", "Lasaña", "Penne", "Lasaña"),
        Respuesta("¿Cuál es el principal ingrediente de la pizza margarita?",
            "Champiñones", "Tomate, mozzarella y albahaca", "Piña y jamón", "Aceitunas y atún", "Tomate, mozzarella y albahaca")
    )

    fun getPreguntaAleatoria(dificultad: String): Respuesta {
        return when (dificultad.lowercase()) {
            "facil" -> preguntasFaciles.random()
            //"media" -> preguntasMedias.random()
            //"experto" -> preguntasExpertas.random()
            else -> preguntasFaciles.random()  // Por defecto, si no se reconoce la dificultad
        }
    }

}