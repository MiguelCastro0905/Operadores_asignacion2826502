package ciclos2826502;

public class EjemploCiclos {
    public static void main(String[] args) {
        int contador;
        //variable acumuladora:
        //nombre significativo
        //recomendaciones: valor inicial:0

        int total=0;

        for(contador=0;
            contador<=10;
            contador++){
                //instruccion de acumulacion
                //no se utiliza la variable de control
                total += contador;
                System.out.println(contador);
            }

            //variable acumuladora
            //siempre despues del cilo

            System.out.println("el total es" + total);
    }

}
