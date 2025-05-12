public class DigitalProfile {
        public static void main(String[] args) {
    
            String nombre = "juan Pedro";
            String apellido = "lussich";
            String ciudad = "Montevideo";
            int edad = 25;
            double altura = 1.77;
            String[] hobbies = new String[3];
            hobbies[0] = "bici";
            hobbies[1] = "musica";
            hobbies[2] = "ymasmusica";
    
            int sem = edad * 52;
            double numero = Math.random() * 99 + 1;
            int suert = (int) Math.round(numero);
    
            String nomComp = nombre + " " + apellido;
            String mayus = nomComp.toUpperCase();
            String ciu = ciudad.substring(0, 3);
            int largo = nomComp.length();
    
            System.out.println("PERFIL DIGITAL DE: " + mayus);
            System.out.println("Ciudad: " + ciu);
            System.out.println("Edad: " + edad + " años (aprox. " + sem + " semanas)");
            System.out.println("Altura: " + altura + " m");
            System.out.println("Tus intereses: " + hobbies[0] + ", " + hobbies[1] + ", " + hobbies[2]);
            System.out.println("Tu número de la suerte es: " + suert);
            System.out.println("Tu nombre tiene " + largo + " caracteres");
    
        }
    }