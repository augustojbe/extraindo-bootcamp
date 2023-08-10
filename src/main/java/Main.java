import br.com.bootcamp.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargahoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso javascripti");
        curso2.setCargahoraria(4);

        Conteudo conteudo = new Curso();


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDecricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAugusto = new Dev();
        devAugusto.setNome("Augusto");
        devAugusto.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Augusto " + devAugusto.getConteudoInscrito());
        devAugusto.progredir();
        devAugusto.progredir();
        System.out.println("--");
        System.out.println("Conteudos Inscritos Augusto " + devAugusto.getConteudoInscrito());
        System.out.println("Conteudos Concluidos Augusto " + devAugusto.getConteudosConcluidos());
        System.out.println("XP:" + devAugusto.calcularTotalXp());

        System.out.println("-----------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos João " + devJoao.getConteudoInscrito());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("--");
        System.out.println("Conteudos Inscritos João " + devJoao.getConteudoInscrito());
        System.out.println("Conteudos Concluidos João " + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());







    }
}