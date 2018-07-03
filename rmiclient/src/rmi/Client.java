package rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Collection;
import java.util.List;

import rmi_base.Aluno;
import rmi_base.EPRMI;
import rmi_base.Resultado;
import rmi_base.Turma;

public class Client {

    public Client(String host) {
    	try {
            reg = LocateRegistry.getRegistry(host);
            stub = (EPRMI) reg.lookup("EPRMI");
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
    
    private Registry reg;
    private EPRMI stub;
    
    
	public long testLong(long i) {
		long start, finish;
		  try {
		      //logger.info("Will try to run tests ");
		      //marcar tempo
		      start = System.nanoTime();
		      long r = stub.testLong(i);
		      finish = System.nanoTime();
		      //marcar tempo
		      //logger.info("Done");
		      return finish-start;
		    } catch (Exception e) {
		      //logger.log(Level.WARNING, "RPC failed", e);
		      return -1;
		    }
	}
	
	public long testVoid() {
		long start, finish;
		  try {
			  //logger.info("Will try to run tests ");
			  //marcar tempo
			  start = System.nanoTime();
			  stub.testVoid();
			  finish = System.nanoTime();
			  //marcar tempo
			  //logger.info("Done");
			  return finish-start;
		  } catch (Exception e) {
			  //e.printStackTrace();
			  return -1;
		  }
	}
	
	public long testEightLong(long i, long j, long k, long l, long m, long n, long o, long p) {
		long start, finish;
		  try {
		      //logger.info("Will try to run tests ");
		      //marcar tempo
		      start = System.nanoTime();
		      long r = stub.testEightLong( i,  j,  k,  l,  m,  n,  o,  p);
		      finish = System.nanoTime();
		      //marcar tempo
		      //logger.info("Done");
		      return finish-start;
		    } catch (Exception e) {
		      //logger.log(Level.WARNING, "RPC failed", e);
		      return -1;
		    }
	}

	public long testEightLongArray(List<Long> l) {
		long start, finish;
		  try {
		      //logger.info("Will try to run tests ");
		      //marcar tempo
		      start = System.nanoTime();
		      long r = stub.testEightLongArray(l);
		      finish = System.nanoTime();
		      //marcar tempo
		      //logger.info("Done");
		      return finish-start;
		    } catch (Exception e) {
		      //logger.log(Level.WARNING, "RPC failed", e);
		      return -1;
		    }
	}

	public long testStringLenght(String s) {
		long start, finish;
		  try {
		      //logger.info("Will try to run tests ");
		      //marcar tempo
		      start = System.nanoTime();
		      String r = stub.testStringLength(s);
		      finish = System.nanoTime();
		      //marcar tempo
		      //logger.info("Done");
		      return finish-start;
		    } catch (Exception e) {
		      //logger.log(Level.WARNING, "RPC failed", e);
		      return -1;
		    }
	}

	public long testComplexType(Turma t) {
		long start,finish;
		try {
		      //logger.info("Will try to run tests ");
		      //marcar tempo
		      start = System.nanoTime();
		      Resultado r = stub.testComplexType(t);
		      finish = System.nanoTime();
		      //marcar tempo
		      //logger.info("Done");
		      return finish-start;
		    } catch (Exception e) {
		      //logger.log(Level.WARNING, "RPC failed", e);
		      return -1;
		    }
	}

	public long testCollection(List<Aluno> alunos) {
		long start, finish;
		  try {
		      //logger.info("Will try to run tests ");
		      //marcar tempo
		      start = System.nanoTime();
		      Collection<Aluno> r = stub.testRemoteCollection(alunos);
		      finish = System.nanoTime();
		      //marcar tempo
		      //logger.info("Done");
		      return finish-start;
		  } catch (Exception e) {
		      //logger.log(Level.WARNING, "RPC failed", e);
		      return -1;
		  }
	}

	public long testArgumentsRequest(Aluno aluno) {
		long start, finish;
		  try {
		      //logger.info("Will try to run tests ");
		      //marcar tempo
		      start = System.nanoTime();
		      stub.testManyArguments(1,Long.MAX_VALUE,0.5f,Double.MIN_VALUE,true,"str",
		    		  1,Long.MAX_VALUE,0.5f,Double.MIN_VALUE,true,"str",
		    		  1,Long.MAX_VALUE,0.5f,Double.MIN_VALUE,true,"str",
		    		  1,Long.MAX_VALUE,0.5f,Double.MIN_VALUE,true,"str",
		    		  1,Long.MAX_VALUE,0.5f,Double.MIN_VALUE,true,"str",
		    		  1,Long.MAX_VALUE,0.5f,Double.MIN_VALUE,true,"str",
		    		  aluno);
		      finish = System.nanoTime();
		      //marcar tempo
		      //logger.info("Done");
		      return finish-start;
		  } catch (Exception e) {
		      //logger.log(Level.WARNING, "RPC failed", e);
		      return -1;
		  }
	}

	public long testException() {
		long start, finish;
		  try {
		      //logger.info("Will try to run tests ");
		      //marcar tempo
		      start = System.nanoTime();
		      stub.testException();
		      finish = System.nanoTime();
		      //marcar tempo
		      //logger.info("Done");
		      return finish-start;
		    } catch (Exception e) {
		      //logger.log(Level.WARNING, "RPC failed", e);
		      return -1;
		    }
	}
    
    
    
}