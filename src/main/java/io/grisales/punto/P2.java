package io.grisales.punto;

/**
 * Esta clase representa un punto en 2D con las coordenadas X e Y
 * @author Mateo Grisales
 */
public class P2 {
    //Atributos
    private int x;
    private int y;

    /**
     * Crea una instancia del objeto P2
     */
    public P2(){
        this.x = this.y = 0;
    }

    /**
     * Crea una instancia del objeto P2
     * @param x Coordenada X
     * @param y Coordenada Y
     */
    public P2(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * Crea una instancia del objeto P2
     * @param p2 es un objeto de punto de dos dimensiones (P2)
     */
    public P2(P2 p2){
        this.x = p2.getX();
        this.y = p2.getY();
    }

    /**
     * Retorna el valor de x
     * @return coordenada x
     */
    public int getX(){
        return this.x;
    }

    /**
     * Asigna el valor de la coordenada x
     * @param x coordenada x
     */
    public void setX(int x){
        this.x = x;
    }

    /**
     * Retorna el valor de la coordenada Y
     * @return coordenada Y
     */
    public int getY(){
        return this.y;
    }

    /**
     * Asigna el valor de Y
     * @param y coordenada Y
     */
    public void setY(int y){
        this.y = y;
    }

    /**
     * Calcula la distancia entre dos puntos
     * @param x coordenada X del otro punto
     * @param y coordenada Y del otro punto
     * @return distancia
     */
    public double calcularDistancia(int x, int y){
        double distancia;
        double diferenciaCuadradosX = Math.pow(this.x - x,2);
        double diferenciaCuadradosY = Math.pow(this.y - y,2);

        distancia = Math.sqrt(diferenciaCuadradosX+diferenciaCuadradosY);

        return distancia;
    }

    /**
     * Calcula la distancia de dos puntos de un objeto
     * @param p2 objeto tipo P2
     * @return distancia
     */
    public double calcularDistancia(P2 p2){
        return this.calcularDistancia(p2.getX(),p2.getY());
    }


    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("X: ").append(this.x).append(" Y: ").append(this.y);

        return sb.toString();
    }
}
