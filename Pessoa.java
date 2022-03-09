package Abstattrec.Pessoa;



public class Pessoa {
    public static void main(String args[]){


    PessoaFisica pessoaF = new PessoaFisica();
        pessoaF.setNome("Lucas ");
        pessoaF.setCpf(15915741733d);
        System.out.println("Nome da pessoa " + pessoaF.getNome()   + "Seu CPF: " + pessoaF.getCpf());


    PessoaJuridica PJ = new PessoaJuridica();
        PJ.setNome("Distribuidora Oliver");
        PJ.setRazaoSocial("Oliver Associados");
        PJ.setCnpj(5414546854000112d);
        System.out.println("Nome do Juridico " + PJ.getNome() + " Razao Social do contrato " +  PJ.getRazaoSocial() + " CNPJ vinculado: " + PJ.getCnpj());
    }
   }



