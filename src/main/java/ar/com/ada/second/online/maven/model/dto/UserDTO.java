package ar.com.ada.second.online.maven.model.dto;
//ENVIAR INFORMACION: Data Transfer Object


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Todas estas anotaciones aplican codigos en compilacion.
@NoArgsConstructor //genera el constructor sin argumentos
@AllArgsConstructor // genera el constructor con argumentos
@Getter //Genera getter de atributos
@Setter // genera setter de atributos


public class UserDTO {
    private Integer ID;
    private String nickName;
    private String email;
}
