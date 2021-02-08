package ar.com.ada.second.online.maven.model.dto;
//ENVIAR INFORMACION: Data Transfer Object


import lombok.*;

//Todas estas anotaciones aplican codigos en compilacion.
@NoArgsConstructor //genera el constructor sin argumentos
@AllArgsConstructor // genera el constructor con argumentos
@Getter //Genera getter de atributos
@Setter // genera setter de atributos
@ToString //genera el metodo To String


public class UserDTO {
    private Integer ID;
    private String nickName;
    private String email;

    //cmo crear constructores rapidos??
    public UserDTO(String nickName, String email){
        this.nickName = nickName;
        this.email = email;
    }

}
