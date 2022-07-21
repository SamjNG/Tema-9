public class Main {


    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Persona1");
        persona.setEdad(20);
        persona.setTelefono("000-111-2222");

        Cliente cliente = new Cliente();
        cliente.setNombre("Persona2");
        cliente.setEdad(22);
        cliente.setTelefono("001-111-2222");
        cliente.setCredito(5000);

        Trabajador  trabajador = new Trabajador();
        trabajador.setNombre("Persona3");
        trabajador.setEdad(26);
        trabajador.setTelefono("003-111-2222");
        trabajador.setSalario(20000);

        System.out.println("Ejemplo de clase Persona");
        System.out.println("Nombre: "+ persona.getNombre());
        System.out.println("Edad: "+ persona.getEdad());
        System.out.println("Telefono: "+ persona.getTelefono());
        System.out.println("");

        System.out.println("Ejemplo de clase Cliente");
        System.out.println("Nombre: "+ cliente.getNombre());
        System.out.println("Edad: "+ cliente.getEdad());
        System.out.println("Telefono: "+ cliente.getTelefono());
        System.out.println("Credito: "+ cliente.getCredito());
        System.out.println("");

        System.out.println("Ejemplo de clase Trabajador");
        System.out.println("Nombre: "+ trabajador.getNombre());
        System.out.println("Edad: "+ trabajador.getEdad());
        System.out.println("Telefono: "+ trabajador.getTelefono());
        System.out.println("Salario: "+ trabajador.getSalario());
        System.out.println("");

    }

    static class Persona{
        int edad;
        String Nombre;
        String Telefono;

        public void setEdad(int edad){
            this.edad = edad;
        }

        public int getEdad() {
            return edad;
        }

        public void setNombre(String nombre) {
            Nombre = nombre;
        }

        public String getNombre() {
            return Nombre;
        }

        public void setTelefono(String telefono){
            Telefono = telefono;
        }

        public String getTelefono() {
            return Telefono;
        }
    }

    static class Cliente extends Persona{
        double credito;

        public void setCredito(int credito) {
            this.credito = credito;
        }

        public double getCredito() {
            return credito;
        }
    }

    static class Trabajador extends Persona{
        double salario;

        public void setSalario(double salario) {
            this.salario = salario;
        }

        public double getSalario() {
            return salario;
        }
    }
}