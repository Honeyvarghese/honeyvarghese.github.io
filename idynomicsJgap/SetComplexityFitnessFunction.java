package idynomicsJgap;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.transform.TransformerException;

import org.jgap.*;

import SetComplexity.SetComplexityFinder;
import idyno.Idynomics;

/**
 * Sample fitness function for the MakeChange example.
 *
 * @author Neil Rotstan
 * @author Klaus Meffert
 * @since 1.0
 */

public class SetComplexityFitnessFunction extends FitnessFunction {
	  /** String containing the CVS revision. Read out via reflection!*/
	  private final static String CVS_REVISION = "$Revision: 1.17 $";

	  private final int m_targetAmount;

	  public static final int MAX_BOUND = 4000;

	  public SetComplexityFitnessFunction(int a_targetAmount) {
	   /* if (a_targetAmount < 1 || a_targetAmount >= MAX_BOUND) {
	      throw new IllegalArgumentException(
	          "Change amount must be between 1 and " + MAX_BOUND + " cents.");
	    }*/
	    m_targetAmount = a_targetAmount;
	  }

	  /**
	   * Determine the fitness of the given Chromosome instance. The higher the
	   * return value, the more fit the instance. This method should always
	   * return the same fitness value for two equivalent Chromosome instances.
	   *
	   * @param a_subject the Chromosome instance to evaluate
	   *
	   * @return positive double reflecting the fitness rating of the given
	   * Chromosome
	   * @since 2.0 (until 1.1: return type int)
	   * @author Neil Rotstan, Klaus Meffert, John Serri
	   */
	  public double evaluate(IChromosome a_subject) {
		  //get chromosome values 
			Map<String,Double> map=new HashMap<String,Double>();

		  Integer value1 =
			        (Integer) a_subject.getGene(0).getAllele();
	int parameterValue1=value1.intValue();
	try {
		WriteToFile.write("Parameter values");
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
		
	}
	try {
		WriteToFile.write("muMax: "+parameterValue1);
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}

		map.put("muMax",(double) parameterValue1 );
		double parameterValue2=getParameterValue(a_subject,1);
		try {
			WriteToFile.write("chemotaticstrength: "+parameterValue2);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		map.put("chemotaticstrength",(double) parameterValue2 );

		
		try {
			//update contact xml of iDynomica with new values in chromosome
			XMLReader.updateParameter(map);
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  //run idynomics
		 Idynomics id =new Idynomics();
		    String[] args={};
		    try {
				id.mainFunction(args);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		    //find Set Complexity
		    
		    double setComplexity = 0;
			try {
				 setComplexity=SetComplexityFinder.calcuate();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				WriteToFile.write("Set Complexity:- "+setComplexity);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		  
		return setComplexity;
	 
	  }

	  /**
	   * Bonus calculation of fitness value.
	   * @param a_maxFitness maximum fitness value appliable
	   * @param a_changeDifference change difference in coins for the coins problem
	   * @return bonus for given change difference
	   *
	   * @author Klaus Meffert
	   * @since 2.3
	   */
	/*  protected double changeDifferenceBonus(double a_maxFitness,
	                                         int a_changeDifference) {
	    if (a_changeDifference == 0) {
	      return a_maxFitness;
	    }
	    else {
	      // we arbitrarily work with half of the maximum fitness as basis for non-
	      // optimal solutions (concerning change difference)
	      if (a_changeDifference * a_changeDifference >= a_maxFitness / 2) {
	        return 0.0d;
	      }
	      else {
	        return a_maxFitness / 2 - a_changeDifference * a_changeDifference;
	      }
	    }
	  }*/

	  /**
	   * Calculates the penalty to apply to the fitness value based on the ammount
	   * of coins in the solution
	   *
	   * @param a_maxFitness maximum fitness value allowed
	   * @param a_coins number of coins in the solution
	   * @return penalty for the fitness value base on the number of coins
	   *
	   * @author John Serri
	   * @since 2.2
	   */
	 /* protected double computeCoinNumberPenalty(double a_maxFitness, int a_coins) {
	    if (a_coins == 1) {
	      // we know the solution cannot have less than one coin
	      return 0;
	    }
	    else {
	      // The more coins the more penalty, but not more than the maximum fitness
	      // value possible. Let's avoid linear behavior and use
	      // exponential penalty calculation instead
	      return (Math.min(a_maxFitness, a_coins * a_coins));
	    }
	  }*/

	  
	 
	  public static double getParameterValue(IChromosome a_potentialSolution,
	                                           int a_position) {
	    Double value =
	        (Double) a_potentialSolution.getGene(a_position).getAllele();
	    return value.doubleValue();
	  }

	 
	  
	}



