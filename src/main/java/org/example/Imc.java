package org.example;

public class Imc {
    private float peso;
    private float altura;
    private String sexo;
    private String condicao;
    private float imc;

    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        if(!(sexo.equals("F") || sexo.equals("f") || sexo.equals("M") || sexo.equals("m"))) {
            throw new IllegalArgumentException("Sexo inválido");
        }

        this.sexo = sexo;
    }
    public String getCondicao() {
        return condicao;
    }
    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }
    public float getImc() {
        return imc;
    }
    public void setImc(float imc) {
        this.imc = imc;
    }

    public String calcularImc() {
        imc = this.peso / (this.altura * this.altura);

        if(sexo.equals("F") || sexo.equals("f")){
            if(imc < 19.1) {
                condicao = "abaixo do peso";
            } else {
                if(imc < 25.8) {
                    condicao = "no peso normal";
                } else {
                    if(imc < 27.3) {
                        condicao = "marginalmente acima do peso normal";
                    } else {
                        if(imc < 32.3) {
                            condicao = "acima do peso ideal";
                        } else {
                            condicao = "obeso";
                        }
                    }
                }
            }
        }
        else {
            if(imc < 20.7) {
                condicao = "abaixo do peso";
            } else {
                if(imc < 26.4) {
                    condicao = "no peso normal";
                } else {
                    if(imc < 27.8) {
                        condicao = "marginalmente acima do peso normal";
                    } else {
                        if(imc < 31.1) {
                            condicao = "acima do peso ideal";
                        } else {
                            condicao = "obeso";
                        }
                    }
                }
            }
        }

        return condicao;
    }
}
