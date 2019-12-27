package io.grisales.punto;

/**
 * Esta clase representa un punto en 3 dimensiones
 * @author Mateo Grisales
 */
public class P3 extends P2 {
    //Atributos
    private int z;

    /**
     * Crea un objeto de tipo P3
     */
    public P3(){
        super();
        this.z = 0;
    }

    /**
     * Crea un objeto de tipo P3
     * @param x coordenada X
     * @param y coordenada Y
     * @param z coordenada Z
     */
    public P3(int x, int y, int z){
        super(x,y);
        this.z = z;
    }

    /**
     * Crea un objeto de tipo P3
     * @param p2 objeto tipo P2
     * @param z coordenada Z
     */
    public P3(P2 p2, int z){
        super(p2);
        this.z = z;
    }

    /**
     * Crea un objeto de tipo P3
     * @param p3 un objeto de 3 coordenadas
     */
    public P3(P3 p3){
        this(p3.getX(), p3.getY(), p3.getZ());
    }

    /**
     * Retorna coordenada Z
     * @return Coordenada Z
     */
    public int getZ(){
        return this.z;
    }

    /**
     * Asigna un valor a la coordenada z
     * @param z coordenada z
     */
    public void setZ(int z){
        this.z = z;
    }

    /**
     * Calcula la distancia entre dos puntos en tres dimensiones
     * @param x coordenada X del otro punto
     * @param y coordenada Y del otro punto
     * @param z coordenada Z del otro punto
     * @return distancia
     */
    public double calcularDistancia(int x, int y, int z){
        double distancia;
        double diferenciaCuadradosX = Math.pow(getX() - x,2);
        double diferenciaCuadradosY = Math.pow(getY() - y,2);
        double diferenciaCuadradosZ = Math.pow(this.z - z,2);

        distancia = Math.sqrt(diferenciaCuadradosX+diferenciaCuadradosY
                +diferenciaCuadradosZ);

        return distancia;
    }

    /**
     * Calcula la distancia entre dos puntos en tres dimensiones
     * @param p2 objeto de tipo P2
     * @param z coordenada Z
     * @return distancia
     */
    public double calcularDistancia(P2 p2, int z){
        return calcularDistancia(p2.getX(), p2.getY(), z);
    }

    /**
     * Calcula la distancia entre dos puntos en tres dimensiones
     * @param p3 objeto de Tipo P3
     * @return distancia
     */
    public double calcularDistancia(P3 p3){
        return calcularDistancia(p3.getX(), p3.getY(), p3.getZ());
    }
    
    public String toString(){
        return super.toString() + " Z:" + this.z;
    }

}
