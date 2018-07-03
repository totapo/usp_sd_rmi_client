package rmi_base;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Collection;
import java.util.List;

public interface EPRMI extends Remote {
	void testVoid() throws RemoteException;
	long testLong(long valor) throws RemoteException;
	long testEightLong(long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8) throws RemoteException;
	long testEightLongArray(List<Long> lista) throws RemoteException;
	String testStringLength(String s) throws RemoteException;
	Resultado testComplexType(Turma t) throws RemoteException;
	Collection<Aluno> testRemoteCollection(Collection<Aluno> col) throws RemoteException;
	void testManyArguments(int num, long num2, float num3, double num4, boolean boole, String str,
			int num7, long num8, float num9, double num10, boolean boole2, String str2,
			int num13, long num14, float num15, double num16, boolean boole3, String str3,
			int num19, long num20, float num21, double num22, boolean boole4, String str4, 
			int num25, long num26, float num27, double num28, boolean boole5, String str5,
		    int num31, long num32, float num33, double num34, boolean boole6, String str6,
		    Aluno aluno) throws RemoteException;
	void testException() throws RemoteException;
}