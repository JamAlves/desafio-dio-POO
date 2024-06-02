package desafiodioPOObr.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
   public static void main(String[] args) {
	   Curso curso1 = new Curso();
	   
	   curso1.setTitulo("curso java");
	   curso1.setDescricao("descricao curso java");
	   curso1.setCargaHoraria(8);
	   
	   Curso curso2 = new Curso();
	   curso2.setTitulo("curso js");
	   curso2.setDescricao("descricao curso js");
	   curso2.setCargaHoraria(8);
	   
	   Mentoria mentoria = new Mentoria();
	   mentoria.setTitulo("mentoria de java");
	   mentoria.setDescricao("descricao mentoria java");
	   mentoria.setDate(LocalDate.now());
	   
	   /*System.out.println(curso1);
	   System.out.println(curso2);
	   System.out.println(mentoria);*/
	   
	   Bootcamp bootcamp = new Bootcamp();
	   bootcamp.setNome("Bootcamp Java Developer");
	   bootcamp.setDescricao("Descricao Bootcamp Java Developer");
	   bootcamp.getConteudos().add(curso1);
	   bootcamp.getConteudos().add(curso2);
	   bootcamp.getConteudos().add(mentoria);
	   
	   
	   
	   Dev devJam = new Dev();
	   devJam.setNome("Jam");
	   devJam.inscreverBootcamp(bootcamp);
	   System.out.println("Conteudos Inscritos Jam" + devJam.getConteudosInscritos());
	   devJam.progredir();
	   System.out.println("-");
	   System.out.println("Conteudos Concluidos Jam" + devJam.getConteudosConcluidos());
	   System.out.println("Conteudos Concluidos Jam" + devJam.getConteudosConcluidos());
	   System.out.println("XP:" + devJam.calcularTotalXp());
	   
	   
	   System.out.println("-----------------------------------------------");
	   
	   Dev devJoao = new Dev();
	   devJoao.setNome("Joao");
	   devJoao.inscreverBootcamp(bootcamp);
	   System.out.println("Conteudos Inscritos Joao" + devJoao.getConteudosInscritos());
	   devJoao.progredir();
	   devJoao.progredir();
	   devJoao.progredir();
	   
	   System.out.println("-");
	   System.out.println("Conteudos Concluidos Joao" + devJam.getConteudosConcluidos());
	   System.out.println("Conteudos Concluidos Joao" + devJam.getConteudosConcluidos());
	   System.out.println("XP:" + devJoao.calcularTotalXp());
   }
}
