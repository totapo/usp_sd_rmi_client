package client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import rmi.Client;
import rmi_base.Aluno;
import rmi_base.EPRMI;
import rmi_base.Materia;
import rmi_base.Professor;
import rmi_base.Turma;



public class Main {
	private static Turma t;
	private static long[] d=new long[]{0,4, 9,10, 45, 6, 7, 8};
	static {
		List<Aluno> lista, apr,repr,rec;
		lista = new ArrayList<Aluno>();
		apr = new ArrayList<Aluno>();
		repr = new ArrayList<Aluno>();
		rec = new ArrayList<Aluno>();
		
		double media,mediaturma;
		
		mediaturma=0;
		
		List<Double> n;
		Aluno alunoAux;
		
		Random ra = new Random();
		for(int i=0; i<60; i++) {
			n = new ArrayList<Double>();
			media=0;
			
			for(int a=0; a<3; a++) {
				n.add(ra.nextDouble()*10.0);
			}
			
			for(Double d : n) {
				media+=d;
			}
			
			media = media/n.size();
			
			alunoAux=new Aluno("Aluno"+i,i,n);
			
			if(media<3.0) {
				repr.add(alunoAux);
			} else if(media<5.0) {
				rec.add(alunoAux);
			} else {
				apr.add(alunoAux);
			}
			
			mediaturma+=media;
			
			lista.add(alunoAux);
		}
		
		mediaturma = mediaturma/lista.size();
		
		Professor p = new Professor("Professor",Long.MAX_VALUE);
		
		Materia m = new Materia("Materia turma cliente","Descricao","CLIENTE");
		
		t = new Turma(lista, p, m);
	}
	/**
	   * Greet server. If provided, the first element of {@code args} is the name to use in the
	   * greeting.
	   */
	  public static void main(String[] args) throws Exception {
	    Client client = new Client("localhost");
	    try {
	    	//client.testVoid();
	    	
	    	System.out.println("long;"+client.testLong(80)/1000000f);
	    	
	    	System.out.println("void;"+client.testVoid()/1000000f);
			  
			System.out.println("8long;"+client.testEightLong(80, -200, 400, 600, 9123, 2, -1233, 42)/1000000f);
			  
			List<Long> l = new ArrayList<Long>();
			for(int i=0; i<d.length; i++) {
				l.add(d[i]);
			}
			System.out.println("8longarray;"+client.testEightLongArray(l)/1000000f);
			  
			String s="";
			System.out.println("stringlen;"+client.testStringLenght(s)/1000000f+";"+s.length());
			s="a";
			for(int i=0; i<22; i++) {
				System.out.println("stringlen;"+client.testStringLenght(s)/1000000f+";"+s.length());
				s=s+s;
			}
			 
			System.out.println("complex;"+client.testComplexType(t)/1000000f);
			  
			System.out.println("collection;"+client.testCollection(t.getAlunos())/1000000f);
			  
			System.out.println("arguments;"+client.testArgumentsRequest(t.getAlunos().get(0))/1000000f);
			  
			System.out.println("exception;"+client.testException()/1000000f);
  
	    } finally {
	    	
	    }
	  }
	  
}
