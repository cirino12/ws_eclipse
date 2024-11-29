package entities;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_user") 
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;  // Atributo privado
    private String nome; // Atributo privado 
    private String email; // Atributo privado
    private String telefone; // atributo privado
    private String password; // Atributo privado
    
    //criar um construtor vazio
    public User() {
    	
    }
    //criar um construtor com todos os campos
    public User(invalid invalid, String nome, String email, String telefone, String password) {
    	this.id = id;
    	this.nome = nome;
    	this.email = email;
    	this.telefone = telefone;
    	this.password = password;
    }
       

        // Getters e Setters
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getTelefone() {
            return telefone;
        }

        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }
        public String getPassword(){
        	return password; 
        	}
        @Override
		public int hashCode() {
			return Objects.hash(email, id, nome, password, telefone);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			User other = (User) obj;
			return Objects.equals(email, other.email) && id == other.id && Objects.equals(nome, other.nome)
					&& Objects.equals(password, other.password) && Objects.equals(telefone, other.telefone);
		}
		public void setPassword(String password) { 
        	this.password = password; 
        	}
        
    }




