package model.vo;

public class LivroVO {
	private String titulo;
	private String genero;
	private int ano;
	private boolean status;
	private AutorVO autor;
		
	// garantindo a integridade dos dados para o titulo
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		if(titulo==null) {
            System.out.println("Por favor, reveja essa informa��o");
		}
		else {
			if(titulo.equals("")) { // perceber diferen�a de null para vazio 
				System.out.println("Por favor, reveja essa informa��o, est� vazia");	
			}
			else
				this.titulo = titulo;
		}	
	}
		
	
	// garantindo a integridade dos dados para o genero
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		if(genero==null) {
			 System.out.println("Por favor, reveja essa informa��o");
		}
		else {
			if(genero.equals("")) {
				System.out.println("Por favor, reveja essa informa��o, est� vazia");
			}
			else 
				this.genero = genero;	
		}
	}
	
	// garantindo a integridade dos dados para o ano
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		if(ano>0)
			this.ano = ano;
		else 
			 System.out.println("Por favor, reveja essa informa��o");
	}
	
	// garantindo a integridade dos dados para o status 
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	

	// garantindo a integridade dos dados para o autor 
	public AutorVO getAutor() {
		return autor;
	}
	
	public void setAutor(AutorVO autor) {
		if(autor==null) {
			 System.out.println("Por favor, reveja essa informa��o");
		}
		else {
		  if(autor.getUsuario().getNome().equals("")) {  // apenas o nome interessa aqui
			  System.out.println("Por favor, reveja essa informa��o, est� vazia");
		  }
		  else
			  this.autor = autor;
		  }
	}
}
