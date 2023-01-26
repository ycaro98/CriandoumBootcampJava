import br.com.desafio.dominio.*;
import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
	        Curso curso1 = new Curso();
	        curso1.setTitulo("Introdução à Programação e Pensamento Computacional");
	        curso1.setDescricao("Curso de Lógica de Programação com a Professora Juliana Mascarenhas");
	        curso1.setCargaHoraria(8);

	        Curso curso2 = new Curso();
	        curso2.setTitulo("curso js");
	        curso2.setDescricao("descrição curso js");
	        curso2.setCargaHoraria(4);

	        Mentoria mentoria = new Mentoria();
	        mentoria.setTitulo("As Etapas para um Planejamento Financeiro Saudável");
	        mentoria.setDescricao("Mentoria para o Bootcamp Orange Teh + | BackEnd");
		    mentoria.setData(LocalDate.now());

		        /*System.out.println(curso1);
		        System.out.println(curso2);
		        System.out.println(mentoria);*/

		    Bootcamp bootcamp = new Bootcamp();
		    bootcamp.setNome("Orange Tech + | BackEnd");
		    bootcamp.setDescricao("O que falta para você se tornar um desenvolvedor Java"
		    		+ " e começar 2023 com uma formação completa?"
		    		+ " Inscreva-se já no Orange Tech+ Back-End e"
		    		+ " tenha mais de 80 horas para transformar sua "
		    		+ "carreira e conquistar as melhores vagas do mercado tech em 2023!"
		    		+ " Tenha acesso a módulos sobre a linguagem Java que vão desde o básico e "
		    		+ "introdução ao ambiente até códigos mais avançados e frameworks mais usados.");
		    bootcamp.getConteudos().add(curso1);
		    bootcamp.getConteudos().add(curso2);
		    bootcamp.getConteudos().add(mentoria);

		    Dev devYcaro = new Dev();
		    devYcaro.setNome("Ycaro");
		    devYcaro.inscreverBootcamp(bootcamp);
		    System.out.println("Conteúdos Inscritos Ycaro:" + devYcaro.getConteudosInscritos());
		    devYcaro.progredir();
		    devYcaro.progredir();
		    System.out.println("-");
		    System.out.println("Conteúdos Inscritos Ycaro:" + devYcaro.getConteudosInscritos());
		    System.out.println("Conteúdos Concluídos Ycaro:" + devYcaro.getConteudosConcluidos());
		    System.out.println("XP:" + devYcaro.calcularTotalXp());
		        
		    System.out.println("-------");
		   
		    Dev devCamila = new Dev();
		    devCamila.setNome("Camila");
		    devCamila.inscreverBootcamp(bootcamp);
		    System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
		    devCamila.progredir();
		    devCamila.progredir();
		    devCamila.progredir();
		    System.out.println("-");
		    System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
		    System.out.println("Conteúdos Concluidos Camila:" + devCamila.getConteudosConcluidos());
		    System.out.println("XP:" + devCamila.calcularTotalXp());

		}
}

