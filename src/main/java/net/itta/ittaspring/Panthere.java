package net.itta.ittaspring;

import lombok.*;

@Builder 
@Getter
@Setter
@ToString
public class Panthere implements Animal{
   
    private @NonNull String nom;
    private  int age;

}
