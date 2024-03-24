package BlockChain;

import java.security.SecureRandom;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class DataEncryptionKey {

	public SecretKey generateKey() throws Exception
	{
	KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
	SecureRandom secureRandom = new SecureRandom();
	int keyBitSize = 256;

	keyGenerator.init(keyBitSize, secureRandom);
	
	SecretKey secretKey = keyGenerator.generateKey();

	return secretKey;
	}
	/**
	 * 
	 * @param agrgs
	 * @throws Exception 
	 */
	public void main(String agrgs[]) throws Exception
	{
		DataEncryptionKey dek= new DataEncryptionKey();
		SecretKey sek =dek.generateKey();
		System.out.println(sek);
		
	}
}
