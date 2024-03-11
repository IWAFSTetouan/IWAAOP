package univ.iwa.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
	final static Logger logger = LoggerFactory.getLogger(LogAspect.class);	
	@After("execution(* *.*.*.*.getAllFilieres(..))")
	public void afterGetFiliere() {
		logger.info("Filiere selected");
	}
	@Before("execution(* *.*.*.*.getAllEtudiants(..))")
	public void beforeGetEtudiants() {
		logger.error("Avant la selection de Etudiant ");
	}
	@Around("execution(* *.*.*.*.getAllEtudiants(String))")
	public void beforeGetEtudiant(ProceedingJoinPoint joinPoint) {
		logger.error("Autour la selection de l'Etudiant "+joinPoint.getArgs()[0]);
	}
}
