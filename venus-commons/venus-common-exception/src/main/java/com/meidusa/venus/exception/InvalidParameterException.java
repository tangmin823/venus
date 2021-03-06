/**
 * 
 */
package com.meidusa.venus.exception;

import com.meidusa.venus.annotations.RemoteException;

/**
 * 
 * 
 * @author Sun Ning
 * @since 2010-3-4
 */
@RemoteException(errorCode=VenusExceptionCodeConstant.PARAMETER_INVALID_EXCEPTION)
public class InvalidParameterException extends AbstractVenusException {
    private static final long serialVersionUID = -1583661559860123414L;

    public InvalidParameterException(String msg) {
        super("InvalidParameterException:" + msg);
    }

    public int getErrorCode() {
        return VenusExceptionCodeConstant.PARAMETER_INVALID_EXCEPTION;
    }

}
