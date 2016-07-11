/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
 
@ManagedBean
public class botoncliente {
   String txtNombre;
    String txApellido;
    String txtCedula;
    String TxtTelefono;
    String TxtCorreo;

    public String getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(String txtNombre) {
        this.txtNombre = txtNombre;
    }

    public String getTxApellido() {
        return txApellido;
    }

    public void setTxApellido(String txApellido) {
        this.txApellido = txApellido;
    }

    public String getTxtCedula() {
        return txtCedula;
    }

    public void setTxtCedula(String txtCedula) {
        this.txtCedula = txtCedula;
    }

    public String getTxtTelefono() {
        return TxtTelefono;
    }

    public void setTxtTelefono(String TxtTelefono) {
        this.TxtTelefono = TxtTelefono;
    }

    public String getTxtCorreo() {
        return TxtCorreo;
    }

    public void setTxtCorreo(String TxtCorreo) {
        this.TxtCorreo = TxtCorreo;
    }
    
    public void Guardar(ActionEvent actionEvent) {
        addMessage("Datos Guardados");
        //poner la clase de guardado en la base de datos 
        
    }
     
    public void Limpiar(ActionEvent actionEvent) {
        addMessage("Pantalla limpia");
    }
    
    public void Buscar(ActionEvent actionEvent) {
        if(this.txtCedula.equalsIgnoreCase("1111111111")){
            addMessage("Datos Encontrados");
            this.TxtCorreo="jose@noexiste.com";
            this.TxtTelefono="066012936";
            this.txApellido="piat";
            this.txtCedula="1111111111";
            this.txtNombre="jose";
        }else{
            addMessage("Datos No Encontrados");
        }
        
    }
     
    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
        
    }
}
