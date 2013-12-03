/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.anrial.daw;

/**
 *
 * @author ana
 */
public class combos {

    int marca = 0;
    int modelo = 0;
    int color = 0;

    String sMarca;
    String sModelo;
    String sColor;

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String modelo() {
        switch (marca) {
            case 1:
                return "<form name='coches' action='combo'>\n"
                        + "<input type=\"hidden\" name=\"marca\" value=\"" + marca + "\">"
                        + "<p>Has elegido BMW</p>\n"
                        + "<p>Elige un modelo:</p>\n"
                        + "<select name=\"modelo\">\n"
                        + "<option value=\"1\">BMW Serie 1</option>"
                        + "<option value=\"2\">BMW Serie 2</option>"
                        + "<option value=\"3\">BMW X3</option>"
                        + "<option value=\"4\">BMW Z4</option>"
                        + "<option value=\"5\">BMW M6</option>"
                        + "</select>\n"
                        + "<input type='submit' value='Enviar'/>\n"
                        + "</form>\n";
            case 2:
                return "<form name='coches' action='combo'>\n"
                        + "<input type=\"hidden\" name=\"marca\" value=\"" + marca + "\">"
                        + "<p>Has elegido Mercedes-Benz</p>\n"
                        + "<p>Elige un modelo:</p>\n"
                        + "<select name=\"modelo\">\n"
                        + "<option value=\"1\">Clase E Berlina</option>"
                        + "<option value=\"2\">SLS AMG Coupé</option>"
                        + "<option value=\"3\">Clase E Estate</option>"
                        + "<option value=\"4\">Clase SL Roadster</option>"
                        + "<option value=\"5\">Clase GL Todoterreno</option>"
                        + "</select>\n"
                        + "<input type='submit' value='Enviar'/>\n"
                        + "</form>\n";
            case 3:
                return "<form name='coches' action='combo'>\n"
                        + "<input type=\"hidden\" name=\"marca\" value=\"" + marca + "\">"
                        + "<p>Has elegido Audi</p>\n"
                        + "<p>Elige un modelo:</p>\n"
                        + "<select name=\"modelo\">\n"
                        + "<option value=\"1\">A1</option>"
                        + "<option value=\"2\">A3 Sedan</option>"
                        + "<option value=\"3\">A5</option>"
                        + "<option value=\"4\">RS 4 Avant</option>"
                        + "<option value=\"5\">R8 Spyder</option>"
                        + "</select>\n"
                        + "<input type='submit' value='Enviar'/>\n"
                        + "</form>\n";
            case 4:
                return "<form name='coches' action='combo'>\n"
                        + "<input type=\"hidden\" name=\"marca\" value=\"" + marca + "\">"
                        + "<p>Has elegido Volkswagen</p>\n"
                        + "<p>Elige un modelo:</p>\n"
                        + "<select name=\"modelo\">\n"
                        + "<option value=\"1\">Polo</option>"
                        + "<option value=\"2\">Golf GTI</option>"
                        + "<option value=\"3\">Passat</option>"
                        + "<option value=\"4\">Sharan</option>"
                        + "<option value=\"5\">Eos</option>"
                        + "</select>\n"
                        + "<input type='submit' value='Enviar'/>\n"
                        + "</form>\n";
            case 5:
                return "<form name='coches' action='combo'>\n"
                        + "<input type=\"hidden\" name=\"marca\" value=\"" + marca + "\">"
                        + "<p>Has elegido Ford</p>\n"
                        + "<p>Elige un modelo:</p>\n"
                        + "<select name=\"modelo\">\n"
                        + "<option value=\"1\">Ford Ka</option>"
                        + "<option value=\"2\">Ford Fiesta</option>"
                        + "<option value=\"3\">C-MAX</option>"
                        + "<option value=\"4\">Ranger Pick-up</option>"
                        + "<option value=\"5\">Galaxy</option>"
                        + "</select>\n"
                        + "<input type='submit' value='Enviar'/>\n"
                        + "</form>\n";
        }
        return "";
    }

    public String color() {
        String sForm = "<form name='coches' action='combo'>"
                + "<input type='hidden' name='marca' value='" + marca + "'/>"
                + "<input type='hidden' name='marca' value='" + modelo + "'/>";

        if (marca == 1) {
            sForm += "<p>Has elegido BMW</p>";
            if (modelo == 1) {
                sForm += "<p>Modelo: BMW Serie 1</p>";
            }
            if (modelo == 2) {
                sForm += "<p>Modelo: BMW Serie 2</p>";
            }
            if (modelo == 3) {
                sForm += "<p>Modelo: BMW X3</p>";
            }
            if (modelo == 4) {
                sForm += "<p>Modelo: BMW Z4</p>";
            }
            if (modelo == 5) {
                sForm += "<p>Modelo: BMW M6</p>";
            }
        }
        if (marca == 2) {
            sForm += "<p>Has elegido Mercedes-Benz</p>";
            if (modelo == 1) {
                sForm += "<p>Modelo: Clase E Berlina</p>";
            }
            if (modelo == 2) {
                sForm += "<p>Modelo: SLS AMG Coupé</p>";
            }
            if (modelo == 3) {
                sForm += "<p>Modelo: Clase E Estate</p>";
            }
            if (modelo == 4) {
                sForm += "<p>Modelo: Clase SL Roadster</p>";
            }
            if (modelo == 5) {
                sForm += "<p>Modelo: Clase GL Todoterreno</p>";
            }
        }
        if (marca == 3) {
            sForm += "<p>Has elegido Audi</p>";
            if (modelo == 1) {
                sForm += "<p>Modelo: A1</p>";
            }
            if (modelo == 2) {
                sForm += "<p>Modelo: A3 Sedán</p>";
            }
            if (modelo == 3) {
                sForm += "<p>Modelo: A5</p>";
            }
            if (modelo == 4) {
                sForm += "<p>Modelo: RS 4 Avant</p>";
            }
            if (modelo == 5) {
                sForm += "<p>Modelo: R8 Spyder</p>";
            }
        }
        if (marca == 4) {
            sForm += "<p>Has elegido Volkswagen</p>";
            if (modelo == 1) {
                sForm += "<p>Modelo: Polo</p>";
            }
            if (modelo == 2) {
                sForm += "<p>Modelo: Golf GTI</p>";
            }
            if (modelo == 3) {
                sForm += "<p>Modelo: Passat</p>";
            }
            if (modelo == 4) {
                sForm += "<p>Modelo: Sharan</p>";
            }
            if (modelo == 5) {
                sForm += "<p>Modelo: Eos</p>";
            }
        }
        if (marca == 5) {
            sForm += "<p>Has elegido Ford</p>";
            if (modelo == 1) {
                sForm += "<p>Modelo: Ford Ka</p>";
            }
            if (modelo == 2) {
                sForm += "<p>Modelo: Ford Fiesta</p>";
            }
            if (modelo == 3) {
                sForm += "<p>Modelo: C-MAX</p>";
            }
            if (modelo == 4) {
                sForm += "<p>Modelo: Ranger Pick-up</p>";
            }
            if (modelo == 5) {
                sForm += "<p>Modelo: Galaxy</p>";
            }
        }
        sForm += "     <p>Elige un color:</p>\n"
                + "     <select name=\"color\"> \n"
                + "         <option value=\"1\">Pintura Sólida Blanca</option>\n"
                + "         <option value=\"2\">Azul Bál</option>\n"
                + "         <option value=\"3\">Amarillo Mus</option>\n"
                + "         <option value=\"4\">Azul Candy</option>\n"
                + "         <option value=\"5\">Negro Grafito</option>\n"
                + "     </select>\n"
                + "     <input type='submit' value='Enviar'/>\n"
                + "</form>";
        return sForm;

    }

    public String resumen() {

        switch (marca) {
            case 1:
                sMarca = "BMW";
                switch (modelo) {
                    case 1:
                        sModelo = "BMW Serie 1";
                        break;
                    case 2:
                        sModelo = "BMW Serie 2";
                        break;
                    case 3:
                        sModelo = "BMW X3";
                        break;
                    case 4:
                        sModelo = "BMW Z4";
                        break;
                    case 5:
                        sModelo = "BMW M6";
                        break;
                }
                break;
            case 2:
                sMarca = "Mercedes-Benz";
                switch (modelo) {
                    case 1:
                        sModelo = "Clase E Berlina";
                        break;
                    case 2:
                        sModelo = "SLS AMG Coupé";
                        break;
                    case 3:
                        sModelo = "Clase E Estate";
                        break;
                    case 4:
                        sModelo = "Clase SL Roadster";
                        break;
                    case 5:
                        sModelo = "Clase GL Todoterreno";
                        break;
                }
                break;
            case 3:
                sMarca = "Audi";
                switch (modelo) {
                    case 1:
                        sModelo = "A1";
                        break;
                    case 2:
                        sModelo = "A3 Sedán";
                        break;
                    case 3:
                        sModelo = "A5";
                        break;
                    case 4:
                        sModelo = "RS 4 Avant";
                        break;
                    case 5:
                        sModelo = "R8 Spyder";
                        break;
                }
                break;
            case 4:
                sMarca = "Volkswagen";
                switch (modelo) {
                    case 1:
                        sModelo = "Polo";
                        break;
                    case 2:
                        sModelo = "Golf GTI";
                        break;
                    case 3:
                        sModelo = "Passat";
                        break;
                    case 4:
                        sModelo = "Sharan";
                        break;
                    case 5:
                        sModelo = "Eos";
                        break;
                }
                break;
            case 5:
                sMarca = "Ford";
                switch (modelo) {
                    case 1:
                        sModelo = "Ford Ka";
                        break;
                    case 2:
                        sModelo = "Ford Fiesta";
                        break;
                    case 3:
                        sModelo = "C-MAX";
                        break;
                    case 4:
                        sModelo = "Ranger Pick-up";
                        break;
                    case 5:
                        sModelo = "Galaxy";
                        break;
                }
                break;
        }

        switch (color) {
            case 1:
                sColor = "Pintura Sólida Blanca";
                break;
            case 2:
                sColor = "Azul Bál";
                break;
            case 3:
                sColor = "Amarillo Mus";
                break;
            case 4:
                sColor = "Azul Candy";
                break;
            case 5:
                sColor = "Negro Grafito";
                break;
        }

        return "<p>Marca: " + sMarca + "</p><p>Modelo: " + sModelo + "</p><p>Color: " + sColor;
    }

}
