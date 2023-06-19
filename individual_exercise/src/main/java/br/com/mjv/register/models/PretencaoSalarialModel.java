package br.com.mjv.register.models;

public class PretencaoSalarialModel {
    private Double minimo;
    private Double maximo;
    
    public PretencaoSalarialModel(Double minimo, Double maximo) {
        this.minimo = minimo;
        this.maximo = maximo;
    }
    public Double getMinimo() {
        return minimo;
    }
    public void setMinimo(Double minimo) {
        if (this.minimo < this.maximo){ 
            this.minimo = minimo;
        }
        this.minimo = 0.00;
    }
    public Double getMaximo() {
        return maximo;
    }
    public void setMaximo(Double maximo) {
        if ( this.maximo > this.minimo){ 
            this.maximo = maximo;
        }
        this.maximo = minimo+1.00;
    }

}
