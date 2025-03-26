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
            pregunta = "¿Cuál es el término culinario para describir el proceso de cocinar carne en su propio jugo a fuego lento?",
            respuesta1 = "Escalfar",
            respuesta2 = "Estofar",
            respuesta3 = "Asar",
            respuesta4 = "Grillar",
            respuestaCorrecta = "Estofar"
        ),
        Pregunta(
            pregunta = "¿Qué tipo de arroz se utiliza para hacer sushi?",
            respuesta1 = "Arroz integral",
            respuesta2 = "Arroz basmati",
            respuesta3 = "Arroz de grano largo",
            respuesta4 = "Arroz de grano corto",
            respuestaCorrecta = "Arroz de grano corto"
        ),
        Pregunta(
            pregunta = "¿Qué tipo de queso se utiliza para preparar un clásico soufflé de queso?",
            respuesta1 = "Queso azul",
            respuesta2 = "Queso parmesano",
            respuesta3 = "Queso suizo",
            respuesta4 = "Queso ricotta",
            respuestaCorrecta = "Queso suizo"
        ),
        Pregunta(
            pregunta = "¿Cómo se llama el aceite de oliva extraído de la primera prensada de las aceitunas?",
            respuesta1 = "Aceite de oliva refinado",
            respuesta2 = "Aceite de oliva virgen",
            respuesta3 = "Aceite de oliva virgen extra",
            respuesta4 = "Aceite de oliva puro",
            respuestaCorrecta = "Aceite de oliva virgen extra"
        ),
        Pregunta(
            pregunta = "¿Qué es el 'mirepoix' en la cocina francesa?",
            respuesta1 = "Una mezcla de hierbas aromáticas",
            respuesta2 = "Una salsa espesa de tomate",
            respuesta3 = "Un sofrito de cebolla, zanahoria y apio",
            respuesta4 = "Un tipo de pasta",
            respuestaCorrecta = "Un sofrito de cebolla, zanahoria y apio"
        ),
        Pregunta(
            pregunta = "¿Qué tipo de pan se utiliza tradicionalmente para hacer un 'croque-monsieur'?",
            respuesta1 = "Pan de pita",
            respuesta2 = "Pan de molde",
            respuesta3 = "Pan baguette",
            respuesta4 = "Pan ciabatta",
            respuestaCorrecta = "Pan de molde"
        ),
        Pregunta(
            pregunta = "¿Cuál es el nombre del método de cocina en el que los alimentos se sumergen brevemente en agua hirviendo y luego se enfrían rápidamente en agua con hielo?",
            respuesta1 = "Blanquear",
            respuesta2 = "Escalfar",
            respuesta3 = "Cocción al vapor",
            respuesta4 = "Pochar",
            respuestaCorrecta = "Blanquear"
        ),
        Pregunta(
            pregunta = "¿Qué tipo de vino se utiliza tradicionalmente para cocinar en un 'coq au vin'?",
            respuesta1 = "Vino tinto",
            respuesta2 = "Vino blanco",
            respuesta3 = "Vino rosado",
            respuesta4 = "Vino espumoso",
            respuestaCorrecta = "Vino tinto"
        ),
        Pregunta(
            pregunta = "¿Qué es la 'tartar' en la cocina?",
            respuesta1 = "Un pastel dulce",
            respuesta2 = "Un pescado crudo marinado",
            respuesta3 = "Una ensalada de pasta",
            respuesta4 = "Un tipo de sopas frías",
            respuestaCorrecta = "Un pescado crudo marinado"
        ),
        Pregunta(
            pregunta = "¿Qué tipo de chocolate se utiliza generalmente en la receta clásica de un 'mousse de chocolate'?",
            respuesta1 = "Chocolate blanco",
            respuesta2 = "Chocolate con leche",
            respuesta3 = "Chocolate amargo o de cobertura",
            respuesta4 = "Chocolate de crema",
            respuestaCorrecta = "Chocolate amargo o de cobertura"
        )
    )

    private val preguntasExperto = listOf(
        Pregunta(
            pregunta = "¿Qué es la 'molecular gastronomy' y quién es considerado su pionero?",
            respuesta1 = "Técnica de cocina tradicional con ingredientes naturales, protagonizada por Ferran Adrià",
            respuesta2 = "Ciencia culinaria que emplea técnicas innovadoras y científicas, protagonizada por Heston Blumenthal",
            respuesta3 = "Uso de microorganismos para fermentar alimentos, protagonizada por René Redzepi",
            respuesta4 = "Técnica de cocción en horno a baja temperatura, protagonizada por Thomas Keller",
            respuestaCorrecta = "Ciencia culinaria que emplea técnicas innovadoras y científicas, protagonizada por Heston Blumenthal"
        ),
        Pregunta(
            pregunta = "¿Cómo se llama el proceso de cocción en el que se sumerge la carne en un baño de grasa caliente para que se cocine lentamente?",
            respuesta1 = "Sous-vide",
            respuesta2 = "Confitado",
            respuesta3 = "Sauté",
            respuesta4 = "Pochar",
            respuestaCorrecta = "Confitado"
        ),
        Pregunta(
            pregunta = "¿Cuál es la principal diferencia entre un 'consommé' y una sopa clara tradicional?",
            respuesta1 = "El consommé es más espeso y se sirve caliente, mientras que la sopa clara es ligera y fría",
            respuesta2 = "El consommé es una sopa muy filtrada y clarificada, mientras que la sopa clara tiene restos de ingredientes",
            respuesta3 = "El consommé se hace con productos lácteos, mientras que la sopa clara no",
            respuesta4 = "El consommé lleva siempre mariscos, mientras que la sopa clara no",
            respuestaCorrecta = "El consommé es una sopa muy filtrada y clarificada, mientras que la sopa clara tiene restos de ingredientes"
        ),
        Pregunta(
            pregunta = "¿Qué técnica de cocina utiliza el proceso de 'deshidratación' mediante la exposición directa al calor seco y el aire caliente?",
            respuesta1 = "Deshidratación al sol",
            respuesta2 = "Cocción por convección",
            respuesta3 = "Cocción por radiación",
            respuesta4 = "Deshidratación en horno",
            respuestaCorrecta = "Deshidratación en horno"
        ),
        Pregunta(
            pregunta = "¿En qué consiste la técnica culinaria llamada 'mise en place'?",
            respuesta1 = "Cocinar los ingredientes a fuego bajo durante un largo periodo",
            respuesta2 = "Preparar, medir y organizar todos los ingredientes antes de cocinar",
            respuesta3 = "Cocinar la comida en una sola olla",
            respuesta4 = "Servir los ingredientes en platos individuales y decorarlos",
            respuestaCorrecta = "Preparar, medir y organizar todos los ingredientes antes de cocinar"
        ),
        Pregunta(
            pregunta = "¿Qué es el 'Caviar de Berenjena' o 'Berenjena Caviar' en la cocina de alta gama?",
            respuesta1 = "Un plato dulce a base de berenjenas y azúcar",
            respuesta2 = "Un aperitivo salado, hecho con berenjenas ahumadas, aceite de oliva y especias",
            respuesta3 = "Un tipo de salsa líquida que se utiliza como aderezo",
            respuesta4 = "Un puré de berenjenas mezclado con caviar real",
            respuestaCorrecta = "Un aperitivo salado, hecho con berenjenas ahumadas, aceite de oliva y especias"
        ),
        Pregunta(
            pregunta = "¿Qué es un 'blanching' o 'blanqueado' en la cocina francesa y cuál es su propósito principal?",
            respuesta1 = "Cocinar rápidamente a alta temperatura para mejorar el sabor",
            respuesta2 = "Hervir brevemente los ingredientes para detener el proceso de oxidación y conservar su color",
            respuesta3 = "Freír ingredientes hasta que estén crujientes",
            respuesta4 = "Cocinar lentamente a fuego bajo para extraer todos los jugos",
            respuestaCorrecta = "Hervir brevemente los ingredientes para detener el proceso de oxidación y conservar su color"
        ),
        Pregunta(
            pregunta = "¿Qué es un 'Roux' y cómo se utiliza en la cocina francesa?",
            respuesta1 = "Un caldo denso de mariscos utilizado como base para sopas",
            respuesta2 = "Una mezcla de harina y grasa cocinada que sirve como base para espesar salsas y sopas",
            respuesta3 = "Un tipo de masa de pan que se utiliza en la pastelería",
            respuesta4 = "Una mezcla de frutas caramelizadas utilizada en postres",
            respuestaCorrecta = "Una mezcla de harina y grasa cocinada que sirve como base para espesar salsas y sopas"
        ),
        Pregunta(
            pregunta = "¿En qué consiste el proceso de 'Caramelización' y cómo afecta a los alimentos?",
            respuesta1 = "El proceso de infusionar azúcar con frutas para crear sabores más complejos",
            respuesta2 = "La oxidación de los azúcares en un líquido caliente que produce un cambio en el sabor y color de los alimentos",
            respuesta3 = "Cocinar los azúcares a alta temperatura hasta que se convierten en jarabe",
            respuesta4 = "La evaporación del agua de un alimento y su transformación en una textura más densa",
            respuestaCorrecta = "La oxidación de los azúcares en un líquido caliente que produce un cambio en el sabor y color de los alimentos"
        ),
        Pregunta(
            pregunta = "¿Qué es el 'Sous-vide' y qué ventajas tiene sobre otros métodos de cocción?",
            respuesta1 = "Es una cocción a alta temperatura que mejora la textura, pero no la retención de nutrientes",
            respuesta2 = "Es una técnica de cocción a baja temperatura y al vacío, que permite conservar los nutrientes y sabores",
            respuesta3 = "Es una cocción a alta presión que cocina rápidamente los ingredientes",
            respuesta4 = "Es una cocción a fuego directo que sella los ingredientes para un sabor más intenso",
            respuestaCorrecta = "Es una técnica de cocción a baja temperatura y al vacío, que permite conservar los nutrientes y sabores"
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
