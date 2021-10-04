package com.example.levanTai.until;

import com.example.levanTai.entity.User;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSSigner;
import com.nimbusds.jose.crypto.MACSigner;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import java.util.Date;

@Component
public class JWTToken {
    private static Logger logger = LoggerFactory.getLogger(JWTToken.class);
    private static final String NAME = "Tai";
    private static final String SECRET =  "hey Mr Tai the secrect length must be at least 256 bits" +
                                            " please no reveal!";
    public String generatedSecret(User user){
        String token = "";
        try {

            JWTClaimsSet.Builder jwtClaimsSet = new JWTClaimsSet.Builder();
            jwtClaimsSet.claim(NAME, user);
            jwtClaimsSet.expirationTime(generateExpirationDate());
            JWTClaimsSet set= jwtClaimsSet.build();

            SignedJWT signedJWT = new SignedJWT(new JWSHeader(JWSAlgorithm.HS256), set);
            JWSSigner signer = new MACSigner(SECRET.getBytes());
            signedJWT.sign(signer);
            token = signedJWT.serialize();
        }
        catch (Exception e) {
            logger.error(e.getMessage());
        }
        return token;
    }
    public Date generateExpirationDate() {
        return new Date(System.currentTimeMillis() + 864000000);
    }
}
