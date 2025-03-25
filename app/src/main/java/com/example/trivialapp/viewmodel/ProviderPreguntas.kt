package com.example.trivialapp.viewmodel

import com.example.trivialapp.model.Pregunta
class  ProviderPreguntas() {
    private val preguntasFacil = listOf(
        Pregunta(
            "¿Cuál de los siguientes ingredientes se usa principalmente para hacer pasta?",
            "A) Harina de maíz",
            "B) Harina de trigo",
            "C) Azúcar",
            "D) Sal",
            "B) Harina de trigo"
        ),
        Pregunta(
            "¿Qué tipo de aceite se utiliza comúnmente para freír alimentos?",
            "A) Aceite de oliva",
            "B) Aceite de coco",
            "C) Aceite de girasol",
            "D) Aceite de sésamo",
            "C) Aceite de girasol"
        ),
        Pregunta(
            "¿Qué ingrediente principal lleva una ensalada César?",
            "A) Pepino",
            "B) Lechuga romana",
            "C) Tomate",
            "D) Zanahoria",
            "B) Lechuga romana"
        ),
        Pregunta(
            "¿En qué tipo de cocina es más común el uso de wasabi?",
            "A) Cocina italiana",
            "B) Cocina japonesa",
            "C) Cocina francesa",
            "D) Cocina mexicana",
            "B) Cocina japonesa"
        ),
        Pregunta(
            "¿Qué tipo de carne es la base de un plato como el 'steak tartar'?",
            "A) Cerdo",
            "B) Pollo",
            "C) Res",
            "D) Cordero",
            "C) Res"
        ),
        Pregunta(
            "¿Qué fruta es utilizada para hacer guacamole?",
            "A) Manzana",
            "B) Aguacate",
            "C) Plátano",
            "D) Naranja",
            "B) Aguacate"
        ),
        Pregunta(
            "¿Cuál de las siguientes es una bebida que se obtiene de la fermentación de uvas?",
            "A) Cerveza",
            "B) Vino",
            "C) Tequila",
            "D) Sidra",
            "B) Vino"
        ),
        Pregunta(
            "¿Cómo se llama el proceso de cocinar alimentos en agua hirviendo durante un corto período?",
            "A) Cocinar al vapor",
            "B) Hervir",
            "C) Escalfar",
            "D) Saltear",
            "B) Hervir"
        ),
        Pregunta(
            "¿Qué tipo de pasta se usa para preparar lasaña?",
            "A) Espaguetis",
            "B) Fettuccine",
            "C) Lasaña",
            "D) Penne",
            "C) Lasaña"
        ),
        Pregunta(
            "¿Cuál es el principal ingrediente de la pizza margarita?",
            "A) Champiñones",
            "B) Tomate, mozzarella y albahaca",
            "C) Piña y jamón",
            "D) Aceitunas y atún",
            "B) Tomate, mozzarella y albahaca"
        )
    )

    private val preguntasMedia = listOf(
        Pregunta(
            "¿Cuál es el principal ingrediente de la pizza margarita?",
            "A) Champiñones",
            "B) Tomate, mozzarella y albahaca",
            "C) Piña y jamón",
            "D) Aceitunas y atún",
            "B) Tomate, mozzarella y albahaca"
        )
    )

    private val preguntasExperto = listOf(
        Pregunta(
            "¿Cuál es el principal ingrediente de la pizza margarita?",
            "A) Champiñones",
            "B) Tomate, mozzarella y albahaca",
            "C) Piña y jamón",
            "D) Aceitunas y atún",
            "B) Tomate, mozzarella y albahaca"
        )
    )

    fun getPreguntasFaciles():List<Pregunta>{
        return preguntasFacil
    }
    fun getPreguntasMedias():List<Pregunta>{
        return preguntasMedia
    }
    fun getPreguntasExperto():List<Pregunta>{
        return preguntasExperto
    }
}
