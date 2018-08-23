/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arun1;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author data
 */
@WebService(serviceName = "factWebService")
public class factWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "Fact")
public int Fact(@WebParam(name = "Fact")int Fact) {
//TODO write your implementation code here:
int i,fact=1;  
int number=5;//It is the number to calculate factorial    
for(i=1;i<=Fact;i++){    
fact=fact*i;    
}
return fact;
}
}
