public class EjemploEstatico {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");
        System.out.println(persona1);
        System.out.println();
        Persona persona2 = new Persona("Karla");
        System.out.println(persona2);
        System.out.println();
        System.out.println("Contador de Clase Personas: " + Persona.getContadorPersonas());
    }
}

class Persona {
    private int idPersona;
    private static int contadorPersonas;
    private String nombre;

    //Constructors
    Persona(){}
    Persona(String nombre){
        this.setIdPersona(contadorPersonas++);
        this.setNombre(nombre);
    }

//    Sets
//    Nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //IdPersona
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

//    Gets
//    Nombre
    public String getNombre() {
        return nombre;
    }
//        IdPersona
    public int getIdPersona() {
        return idPersona;
    }
//    ContadorPersonas
    public static int getContadorPersonas() {
        return contadorPersonas;
    }


    public String toString(){
        return super.toString() + "{\n"
                + "Nombre: " + this.getNombre()+"\n"
                +"IdPersona: " + this.getIdPersona()+"\n"
                +"}";
    }
}
