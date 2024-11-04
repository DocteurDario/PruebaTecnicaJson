import java.time.LocalDate;

public class Ejemplo3 {




    public static void main(String[] args) {

        //  Realiza una clase empleado la instancia mediante un array de empleados, pasando los parámetros por el constructor.
        //  Luego recorre el array utilizando un forech.
        //  Realizar el ejemplo.
        LocalDate fcha= LocalDate.of(1985, 3, 14);

        Persona persona = new Persona("Dario","Docteur","Libertad 4110",39,fcha);

        System.out.println(persona.toString());

        Persona[] personaArray = new Persona[5];

        int incrementa=1;

        for(int i=0 ; i < personaArray.length ; i++ )
        {

            personaArray[i]=persona;

        }

        personaArray[1].setEdad(incrementa++);

        for(Persona indice: personaArray)
        {
            System.out.println(indice.toString());
        }


    }

}

class Persona {
    private String Nombre;
    private String Apellido;
    private String Direccion;
    private int edad;
    LocalDate fechaNacimiento;

    public Persona( String Nombre, String Apellido, String Direccion, int edad, LocalDate fechaNacimiento)
    {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Direccion = Direccion;
        this.edad= edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    void setEdad( int nro)
    {
        edad=nro;
    }

    @Override
    public String toString() {
        return "Persona es: " +
                "Nombre='" + Nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", Direccion='" + Direccion + '\'' +
                ", edad=" + edad +
                ", fechaNacimiento=" + fechaNacimiento +
                '.';
    }


}