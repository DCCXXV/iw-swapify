package es.ucm.fdi.iw.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import es.ucm.fdi.iw.model.User;

public class UserService {

    // no deberian ser esticas, arreglar cuando se haya que hacerlo bien
    public static List<User> getRecommendedUsers() {
        ArrayList<User> recommendedUsers = new ArrayList<>();

        // Crear usuarios ficticios
        User usuario1 = new User(
            "Juan Alberto",
            "¡Hola! Soy Juan Alberto, me gustaría aprender alemán o expandir mis conocimientos de programación aprendiendo Java! Tengo amplios conocimientos en Python y soy fluido en Inglés y Francés.",
            "JuanAlberto.jpg",
            Arrays.asList("Inglés", "Francés", "Programación en Python", "Desarrollo web"),
            Arrays.asList("Programación en Java", "Alemán")
        );

        User usuario2 = new User(
            "Ana",
            "¡Hola! Soy Ana, me encantaría aprender edición de fotografía. Soy profesora de yoga con 5 años de experiencia y también puedo enseñar técnicas de meditación. ¡Hablo francés fluidamente!",
            "Ana.jpg",
            Arrays.asList("Francés", "Yoga", "Meditación"),
            Arrays.asList("Edición de fotografía")
        );

        User usuario3 = new User(
            "Luis",
            "Me llamo Luis y estoy buscando mejorar mi italiano, aunque también recientemente he tenido ganas de aprender edición de fotografía. Soy guitarrista con experiencia en música clásica y flamenca, y también puedo enseñar diseño gráfico básico con Adobe Illustrator o inglés ya que estoy certificado con un C1 por Cambridge.",
            "Luis.jpg",
            Arrays.asList("Inglés", "Guitarra", "Diseño gráfico"),
            Arrays.asList("Edición de fotografía", "Italiano")
        );

        User usuario4 = new User(
            "María",
            "Soy María y me gustaría aprender a cocinar. Tengo experiencia dando clases de baile (salsa y bachata) y soy contadora profesional, puedo ayudar con temas de finanzas personales y Excel avanzado. Además, debido a mi experiencia laboral, tengo un alto nivel de inglés.",
            "María.jpg",
            Arrays.asList("Inglés", "Salsa", "Bachata", "Excel"),
            Arrays.asList("Cocina")
        );

        // Añadir usuarios a la lista
        recommendedUsers.add(usuario1);
        recommendedUsers.add(usuario2);
        recommendedUsers.add(usuario3);
        recommendedUsers.add(usuario4);

        return recommendedUsers;
    }

    public static List<User> getPopularUsers() {
        ArrayList<User> popularUsers = new ArrayList<>();
    
        // Crear usuarios ficticios
        User user1 = new User(
            "Carlos",
            "¡Hola! Soy Carlos, un apasionado del deporte. Me encanta jugar al fútbol y también soy entrenador personal. Hablo inglés y estoy aprendiendo portugués.",
            "CarlosPerez.jpg",
            Arrays.asList("Fútbol", "Entrenamiento personal", "Inglés"),
            Arrays.asList("Portugués", "Nutrición")
        );
    
        User user2 = new User(
            "Laura",
            "Hola, soy Laura. Soy diseñadora gráfica y me encanta crear contenido visual. También tengo experiencia en marketing digital y hablo francés.",
            "LauraGomez.jpg",
            Arrays.asList("Diseño gráfico", "Marketing digital", "Francés"),
            Arrays.asList("Fotografía", "Redes sociales")
        );
    
        User user3 = new User(
            "Pedro",
            "Me llamo Pedro y soy desarrollador de software. Tengo experiencia en JavaScript y React. Me gustaría aprender más sobre inteligencia artificial y machine learning.",
            "PedroMartinez.jpg",
            Arrays.asList("JavaScript", "React", "Desarrollo web"),
            Arrays.asList("Inteligencia artificial", "Machine learning")
        );
    
        User user4 = new User(
            "Sofía",
            "Soy Sofía, una amante de la naturaleza y la fotografía. Me encanta hacer senderismo y capturar paisajes con mi cámara. También hablo inglés y estoy aprendiendo alemán.",
            "SofiaRamirez.jpg",
            Arrays.asList("Fotografía", "Senderismo", "Inglés"),
            Arrays.asList("Alemán", "Ecología")
        );
    
        User user5 = new User(
            "Diego",
            "Hola, soy Diego. Soy músico y compositor. Toco varios instrumentos y me encanta enseñar música a otros. También hablo italiano y estoy aprendiendo ruso.",
            "DiegoLopez.jpg",
            Arrays.asList("Música", "Composición", "Italiano"),
            Arrays.asList("Ruso", "Producción musical")
        );
    
        User user6 = new User(
            "Elena",
            "Me llamo Elena y soy chef profesional. Me especializo en cocina mediterránea y me encanta experimentar con nuevos sabores. Hablo inglés y francés.",
            "ElenaFernandez.jpg",
            Arrays.asList("Cocina", "Cocina mediterránea", "Inglés", "Francés"),
            Arrays.asList("Repostería", "Cocina asiática")
        );
    
        User user7 = new User(
            "Miguel",
            "Soy Miguel, un entusiasta de la tecnología. Trabajo como administrador de sistemas y me encanta todo lo relacionado con la ciberseguridad. Hablo inglés y estoy aprendiendo chino.",
            "MiguelSanchez.jpg",
            Arrays.asList("Administración de sistemas", "Ciberseguridad", "Inglés"),
            Arrays.asList("Chino", "Redes")
        );
    
        User user8 = new User(
            "Isabel",
            "Hola, soy Isabel. Soy profesora de matemáticas y me encanta enseñar. También tengo experiencia en programación en Python y hablo inglés.",
            "IsabelRodriguez.jpg",
            Arrays.asList("Matemáticas", "Programación en Python", "Inglés"),
            Arrays.asList("Educación", "Inteligencia artificial")
        );

        User user9 = new User(
            "Lucía",
            "¡Hola! Soy Lucía, una apasionada de la música y la tecnología. Toco la guitarra y me encanta programar en mis tiempos libres. Hablo alemán y estoy aprendiendo japonés.",
            "LuciaFernandez.jpg",
            Arrays.asList("Guitarra", "Programación", "Alemán"),
            Arrays.asList("Japonés", "Producción musical")
        );

    
        // Añadir usuarios a la lista
        popularUsers.add(user1);
        popularUsers.add(user8);
        popularUsers.add(user3);
        popularUsers.add(user4);
        popularUsers.add(user5);
        popularUsers.add(user6);
        popularUsers.add(user7);
        popularUsers.add(user2);
        popularUsers.add(user9);
    
        return popularUsers;
    }
}
