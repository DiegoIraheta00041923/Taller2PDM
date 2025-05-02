package com.pdmtaller2.DiegoIraheta_00041923.data

import com.pdmtaller2.DiegoIraheta_00041923.models.Dish
import com.pdmtaller2.DiegoIraheta_00041923.models.Restaurant

//DATOS SACADOS DE CHATGPT, IMAGENES SACADAS DE LA WEB
val restaurants =
    listOf(
        Restaurant(
            id = 1,
            name = "Taco Fiesta",
            description = "Auténticos sabores de México.",
            imageURL =
                "https://res.cloudinary.com/teepublic/image/private/s--pDgdhqP0--/t_Resized%20Artwork/c_fit,g_north_west,h_954,w_954/co_000000,e_outline:48/co_000000,e_outline:inner_fill:48/co_ffffff,e_outline:48/co_ffffff,e_outline:inner_fill:48/co_bbbbbb,e_outline:3:1000/c_mpad,g_center,h_1260,w_1260/b_rgb:eeeeee/c_limit,f_auto,h_630,q_auto:good:420,w_630/v1617351683/production/designs/20776090_0.jpg",
            categories = listOf("Comida Mexicana", "Comida Rápida"),
            menu =
                listOf(
                    Dish(
                        id = 1,
                        name = "Tacos al Pastor",
                        description = "Tacos tradicionales con carne al pastor y piña.",
                        imageURL =
                            "https://lomaculinaria.com/wp-content/uploads/2023/08/Tacos-al-Pastor-Culinary-Hill-1200x800-1-500x500.webp"),
                    Dish(
                        id = 2,
                        name = "Quesadillas",
                        description = "Quesadillas de queso y huitlacoche.",
                        imageURL = "https://recetasdecocina.elmundo.es/wp-content/uploads/2025/01/quesadillas-1024x683.jpg")
                )),
        Restaurant(
            id = 2,
            name = "Noodle House",
            description = "Delicias orientales y sabores exóticos.",
            imageURL = "https://d1csarkz8obe9u.cloudfront.net/posterpreviews/noodle-house-logo-design-template-6286a41416cfeb5966d95c2c50baab2d_screen.jpg?ts=1740552062",
            categories = listOf("Comida Asiática", "Comida Saludable"),
            menu =
                listOf(
                    Dish(
                        id = 3,
                        name = "Ramen",
                        description = "Sopa japonesa con fideos y huevo marinado.",
                        imageURL = "https://recetasdecocina.elmundo.es/wp-content/uploads/2025/03/ramen-receta.jpg"),
                    Dish(
                        id = 4,
                        name = "Arroz Frito Vegano",
                        description = "Arroz salteado con vegetales frescos.",
                        imageURL = "https://veganoutreach.org/wp-content/uploads/2021/01/Fried_Rice.jpg")
                )),
        Restaurant(
            id = 3,
            name = "Dolce Postres",
            description = "Dulces momentos, postres perfectos.",
            imageURL =
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQxiWzOlfqxwvPW9fw76vgFIKXpdrlw59DPVQ&s",
            categories = listOf("Postres y Dulces"),
            menu =
                listOf(
                    Dish(
                        id = 5,
                        name = "Cheesecake de Fresa",
                        description = "Suave tarta de queso con fresas naturales.",
                        imageURL = "https://peopleenespanol.com/thmb/8vzve3hmeCgC-SVqkvAmuXnMMBE=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/cheesecake-facil-con-leche-condensada-2000-4160526441114bf3ad8f3409586a2c8a.jpg"),
                    Dish(
                        id = 6,
                        name = "Brownie de Chocolate",
                        description = "Brownie caliente con nuez y helado.",
                        imageURL = "https://www.justspices.es/media/recipe/brownie-chocolate.jpg")
                )),
        Restaurant(
            id = 4,
            name = "Green Life",
            description = "Comida saludable y deliciosa.",
            imageURL = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRejt45qiDvV9IUT2SNdEFgcROiXfazySxN86f-Tj5-iqFJ0Sou7q9y9QFXPUYJAuQGrHg&usqp=CAU",
            categories = listOf("Comida Saludable", "Vegetariano"),
            menu =
                listOf(
                    Dish(
                        id = 7,
                        name = "Ensalada Mediterránea",
                        description = "Con quinoa, aceitunas y vegetales frescos.",
                        imageURL = "https://imag.bonviveur.com/ensalada-mediterranea.jpg"),
                    Dish(
                        id = 8,
                        name = "Wrap Vegano",
                        description = "Tortilla integral con hummus y vegetales.",
                        imageURL = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTnxFRA5u3jI030XHhE5EaUF3-UuhsAa8TLXA&s")
                )),
        Restaurant(
            id = 5,
            name = "Bebidas Urbanas",
            description = "Refresca tu día con algo diferente.",
            imageURL =
                "https://img.freepik.com/vector-premium/delicioso-jugo-verano-increible-fondo-playa-cocteles-bebiendo-vaso-playa-mar_135595-44623.jpg?semt=ais_hybrid&w=740",
            categories = listOf("Bebidas", "Postres y Dulces"),
            menu =
                listOf(
                    Dish(
                        id = 9,
                        name = "Smoothie de Mango",
                        description = "Bebida natural y refrescante con mango.",
                        imageURL = "https://www.goodnes.com/sites/g/files/jgfbjl321/files/srh_recipes/50bc35dd2212868d66ebc7cff0e618c0.jpg"),
                    Dish(
                        id = 10,
                        name = "Café Frappé",
                        description = "Café helado con crema batida.",
                        imageURL = "https://www.gourmet.cl/wp-content/uploads/2023/11/CAFE-HELADO.jpg")
                )),
        Restaurant(
            id = 6,
            name = "Sushi Go!",
            description = "Sushi fresco y delicioso al instante.",
            imageURL = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSeWdd9HdnEVpV1c5V-10nPZDC2uK9c8ggp5A&s",
            categories = listOf("Comida Asiática", "Comida Saludable"),
            menu =
                listOf(
                    Dish(
                        11,
                        "Sushi Mixto",
                        "Rollos surtidos con pescado fresco.",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSh2pW4ILFRCqs0D_Um1vE5apjFLg3jqsmTVw&s"),
                    Dish(
                        12,
                        "Nigiri de Salmón",
                        "Salmón fresco sobre arroz.",
                        "https://i.blogs.es/333801/nigiri-sushi-5/1366_2000.jpg")
                )),
        Restaurant(
            id = 7,
            name = "La Taquería",
            description = "Los tacos más auténticos del norte.",
            imageURL = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRilnMPKhWeUkLFo52d2Bn5jHodaNQ2-uI2Rw&s",
            categories = listOf("Comida Mexicana"),
            menu =
                listOf(
                    Dish(
                        13,
                        "Tacos de Asada",
                        "Carne asada con cebolla y cilantro.",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQrPsCHRLgQbAbOCqieML-MwCLQCrEMCSP1IQ&s"),
                    Dish(
                        14,
                        "Tacos de Chorizo",
                        "Chorizo picante con papa.",
                        "https://assets.unileversolutions.com/recipes-v2/252244.png")
                )),
        Restaurant(
            id = 8,
            name = "Veggie Life",
            description = "Comida vegana para todos.",
            imageURL = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR2-Jf69LAofhZbbgaJ0cxx6fj6YdYiPMBZLw&s",
            categories = listOf("Comida Saludable", "Vegetariano"),
            menu =
                listOf(
                    Dish(
                        15,
                        "Hamburguesa Vegana",
                        "Hamburguesa de lentejas y quinoa.",
                        "https://juanllorca.com/wp-content/uploads/2020/05/IMG_1979-1-scaled.jpeg"),
                    Dish(
                        16,
                        "Tofu Bowl",
                        "Bowl de arroz integral y tofu marinado.",
                        "https://naturallieplantbased.com/wp-content/uploads/2023/09/tofu-buddha-bowl-1-500x500.jpg")
                )),
        Restaurant(
            id = 9,
            name = "Il Forno",
            description = "Pizzas y pastas al estilo italiano.",
            imageURL = "https://eltesoro.com.co/wp-content/uploads/2020/07/ilforno-logo-el-tesoro-1.png",
            categories = listOf("Comida Italiana"),
            menu =
                listOf(
                    Dish(
                        17,
                        "Lasagna",
                        "Capas de pasta con carne y queso.",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ73xyJnJvRAGkOybHGbacQQa8a-uAArfOgMQ&s"),
                    Dish(
                        18,
                        "Pizza Margherita",
                        "Pizza clásica con tomate y albahaca.",
                        "https://assets.tmecosys.com/image/upload/t_web_rdp_recipe_584x480/img/recipe/ras/Assets/5802fab5-fdce-468a-a830-43e8001f5a72/Derivates/c00dc34a-e73d-42f0-a86e-e2fd967d33fe.jpg")
                )),
        Restaurant(
            id = 10,
            name = "Donas & Más",
            description = "Los postres más ricos de la ciudad.",
            imageURL = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQsl6Ljtb0vyYvheep0LO8OWAemuWfQZxd7wA&s",
            categories = listOf("Postres y Dulces"),
            menu =
                listOf(
                    Dish(
                        19,
                        "Dona Glaseada",
                        "Dona dulce con glaseado de vainilla.",
                        "https://i.pinimg.com/736x/30/62/6b/30626b3eb4cf7718193b8bcac32fa14b.jpg"),
                    Dish(
                        20,
                        "Muffin de Chocolate",
                        "Muffin esponjoso con chispas.",
                        "https://www.recetasnestle.com.pe/sites/default/files/srh_recipes/c5a43503a2031aadda4febe51673a020.jpg")
                )),
        Restaurant(
            id = 11,
            name = "Ramen Express",
            description = "Ramen japonés en minutos.",
            imageURL = "https://ramenexpress.com.mx/cdn/shop/files/LOGO.jpg?v=1738869200&width=600",
            categories = listOf("Comida Asiática", "Comida Rápida"),
            menu =
                listOf(
                    Dish(
                        21,
                        "Ramen Clásico",
                        "Con cerdo, huevo y alga nori.",
                        "https://elcomercio.pe/resizer/v2/EO6WA2C44JAIHP43OO32KO7YYM.jpg?auth=6890321fd58680048c0fd25a4477ed6228f80f755aae5110b0dd106d6c6cc495&width=1200&height=1200&quality=75&smart=true"),
                    Dish(
                        22,
                        "Ramen Picante",
                        "Ramen con chili rojo y ajonjolí.",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR_o86UH4J0lwaThBv-fLgga7HE10r1NlkJ5g&s")
                )),
        Restaurant(
            id = 12,
            name = "Smoothie House",
            description = "Refresca tu día de forma natural.",
            imageURL = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQSt9kBb1wBXQ3uVKavyBkMTBVzAiY1U84UiA&s",
            categories = listOf("Bebidas", "Comida Saludable"),
            menu =
                listOf(
                    Dish(
                        23,
                        "Smoothie Verde",
                        "Espinaca, manzana y piña.",
                        "https://assets.tmecosys.com/image/upload/t_web_rdp_recipe_584x480_1_5x/img/recipe/ras/Assets/0F1B787A-90B0-4072-8832-DE798187B781/Derivates/F28D7900-64B8-4CAB-AE0B-A2038335532D.jpg"),
                    Dish(
                        24,
                        "Smoothie de Frutos Rojos",
                        "Fresas, arándanos y yogurt.",
                        "https://okdiario.com/img/recetas/2017/07/04/smoothie-de-frutos-rojos.jpg")
                )),
        Restaurant(
            id = 13,
            name = "Pastas Nonna",
            description = "Sabor tradicional de Italia.",
            imageURL = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT86toS-rA8K3XiD1xJBhd_T-SfnaaOf1P0-A&s",
            categories = listOf("Comida Italiana"),
            menu =
                listOf(
                    Dish(
                        25,
                        "Spaghetti Bolognesa",
                        "Con salsa de carne tradicional.",
                        "https://www.maggi.ph/sites/default/files/srh_recipes/ec9fce823d23bbb054d52aea1981fc0c.jpg"),
                    Dish(
                        26,
                        "Penne al Pesto",
                        "Con albahaca, ajo y parmesano.",
                        "https://www.hazteveg.com/img/recipes/full/201511/R24-25719.jpg")
                )),
        Restaurant(
            id = 14,
            name = "Fritas Express",
            description = "Rápido, crujiente y sabroso.",
            imageURL = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRmiL_v_h2tarj-rYFlD-rOIeZ_34YMlUoadw&sv",
            categories = listOf("Comida Rápida"),
            menu =
                listOf(
                    Dish(
                        27,
                        "Papas con Queso",
                        "Con salsa cheddar y tocino.",
                        "https://tomaleche.com/wp-content/uploads/sites/2/2021/06/GettyImages-921916164-scaled.jpg"),
                    Dish(
                        28,
                        "Papas Curly",
                        "Fritas con especias.",
                        "https://cdn.shopify.com/s/files/1/0078/5730/7737/files/81096-papas-curly-crudo_900x900.png?v=1735331180")
                )),
        Restaurant(
            id = 15,
            name = "Heladería Polar",
            description = "Los helados más fríos y cremosos.",
            imageURL = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSvMwIkaRMqyFdo5OCRwltBlQ0FCk_w2pHygA&shttps://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSvMwIkaRMqyFdo5OCRwltBlQ0FCk_w2pHygA&s",
            categories = listOf("Postres y Dulces"),
            menu =
                listOf(
                    Dish(
                        29,
                        "Helado de Vainilla",
                        "Cremoso y natural.",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSvPK88H4O6Oyq5dUeBrZbUbYnFvGOCcIPYlA&sv"),
                    Dish(
                        30,
                        "Banana Split",
                        "Con frutas, helado y crema.",
                        "https://laroussecocina.mx/wp-content/uploads/2023/04/BananaSplit_2_-1-e1681937886955.jpg")
                )),
        Restaurant(
            id = 16,
            name = "Poke Lover",
            description = "Bowl hawaiano al gusto.",
            imageURL = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSX1ohhPy71Kv3UxLmJ2PXTWgjmN6geFSFN0g&s",
            categories = listOf("Comida Saludable", "Comida Asiática"),
            menu =
                listOf(
                    Dish(
                        31,
                        "Poke de Salmón",
                        "Con arroz y aguacate.",
                        "https://www.orientalmarket.es/recetas/wp-content/uploads/2021/10/receta-poke-bowl-spacy-salmon-scaled.jpg"),
                    Dish(
                        32,
                        "Poke Veggie",
                        "Con tofu, pepino y mango.",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQE8HmWqkip1Hp4SmL3c0tq-cr9Ef2-zIt5NA&s")
                )),
        Restaurant(
            id = 17,
            name = "Wraps Factory",
            description = "Wraps para todos los gustos.",
            imageURL = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQjXRiUH8Xh_dkf9z6psB3uzIbma5yMwOJeHQ&sv",
            categories = listOf("Comida Saludable", "Comida Rápida"),
            menu =
                listOf(
                    Dish(
                        33,
                        "Wrap de Pollo",
                        "Con lechuga y aderezo ranch.",
                        "https://www.gourmet.cl/wp-content/uploads/2016/09/wrap-de-pollo.jpg-editada.jpg"),
                    Dish(
                        34,
                        "Wrap Mediterráneo",
                        "Con hummus y vegetales asados.",
                        "https://es.starkist.com/wp-content/uploads/2020/11/recipes_910wx445hmedchickenwrap.jpg")
                )),
        Restaurant(
            id = 18,
            name = "Coffee Palace",
            description = "Un rincón para los amantes del café.",
            imageURL = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQtuZ1owf6nT7JOAYnJPlQsSyi5UmDlFVbzwQ&shttps://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQtuZ1owf6nT7JOAYnJPlQsSyi5UmDlFVbzwQ&s",
            categories = listOf("Bebidas", "Postres y Dulces"),
            menu =
                listOf(
                    Dish(35,
                        "Café Latte",
                        "Con leche espumada.",
                        "https://www.somoselcafe.com.ar/img/novedades/87.jpg"),
                    Dish(
                        36,
                        "Capuccino",
                        "Con canela y espuma.",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS9XAW2dKjfyKedMHS0RCpElyziMJxhllI6lw&s")
                )),
        Restaurant(
            id = 19,
            name = "Enchiladas México",
            description = "Recetas caseras con amor mexicano.",
            imageURL = "https://img.freepik.com/vector-premium/enchiladas-cocina-mexicana-vector-icono-comida-rapida_8071-23504.jpghttps://img.freepik.com/vector-premium/enchiladas-cocina-mexicana-vector-icono-comida-rapida_8071-23504.jpg",
            categories = listOf("Comida Mexicana"),
            menu =
                listOf(
                    Dish(
                        37,
                        "Enchiladas Verdes",
                        "Con pollo y salsa de tomatillo.",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRR1DN42UuK7g51nOwulM5-dnVD32b2l0ikHQ&s"),
                    Dish(
                        38,
                        "Enchiladas Rojas",
                        "Con carne y chile guajillo.",
                        "https://www.la-cocina-mexicana.com/base/stock/Recipe/enchiladas-rojas/enchiladas-rojas_web.jpg")
                )),
        Restaurant(
            id = 20,
            name = "Fusión Oriental",
            description = "Cocina asiática con un toque moderno.",
            imageURL = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSe8av-9651aSURczrZQOVv1ZpR_hXigv58Sg&s",
            categories = listOf("Comida Asiática", "Comida Saludable"),
            menu =
                listOf(
                    Dish(
                        39,
                        "Pollo Teriyaki",
                        "Con arroz jazmín y vegetales.",
                        "https://cdn.recetasderechupete.com/wp-content/uploads/2014/04/pollo_teriyaki.jpg"),
                    Dish(
                        40,
                        "Wok de Verduras",
                        "Salteado estilo oriental.",
                        "https://e00-xlk-cooking-elmundo.uecdn.es/files/article_main_microformat_1_1/uploads/2023/03/01/63fe8790a23bf.jpeg")
                ))
    )

val order = mutableListOf<Dish>()
