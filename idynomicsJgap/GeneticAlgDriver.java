package idynomicsJgap;
import org.jgap.Chromosome;
import org.jgap.Configuration;
import org.jgap.FitnessFunction;
import org.jgap.Gene;
import org.jgap.Genotype;
import org.jgap.IChromosome;
import org.jgap.InvalidConfigurationException;
import org.jgap.impl.DefaultConfiguration;
import org.jgap.impl.DoubleGene;
import org.jgap.impl.IntegerGene;

import SetComplexity.SetComplexityFinder;
public class GeneticAlgDriver {


		public static void main(String args[]) throws InvalidConfigurationException
		{
			 // Start with a DefaultConfiguration, which comes setup with the
			  // most common settings.
			  // -------------------------------------------------------------
			  Configuration conf = new DefaultConfiguration();

			  // Set the fitness function we want to use, which is our
			  // MinimizingMakeChangeFitnessFunction that we created earlier.
			  // We construct it with the target amount of change provided
			  // by the user.
			  // ------------------------------------------------------------
			  int targetAmount = 2;
			  SetComplexityFitnessFunction myFunc =
			    new SetComplexityFitnessFunction(targetAmount );

			  conf.setFitnessFunction( myFunc );

			  // Now we need to tell the Configuration object how we want our
			  // Chromosomes to be setup. We do that by actually creating a
			  // sample Chromosome and then setting it on the Configuration
			  // object. As mentioned earlier, we want our Chromosomes to
			  // each have four genes, one for each of the coin types. We
			  // want the values of those genes to be integers, which represent
			  // how many coins of that type we have. We therefore use the
			  // IntegerGene class to represent each of the genes. That class
			  // also lets us specify a lower and upper bound, which we set
			  // to sensible values for each coin type.
			  // --------------------------------------------------------------
			  Gene[] sampleGenes = new Gene[ 3];

			  sampleGenes[0] = new IntegerGene(conf, 599,600 ); 
			  sampleGenes[1] = new DoubleGene(conf, 1.99,2); 
			  sampleGenes[2]=new DoubleGene(conf,0.2,0.3);

			 
			  Chromosome sampleChromosome = new Chromosome(conf, sampleGenes );

			  conf.setSampleChromosome( sampleChromosome );

			  // Finally, we need to tell the Configuration object how many
			  // Chromosomes we want in our population. The more Chromosomes,
			  // the larger the number of potential solutions (which is good
			  // for finding the answer), but the longer it will take to evolve
			  // the population each round. We'll set the population size to
			  // 500 here.
			  // --------------------------------------------------------------
			  conf.setPopulationSize( 2);
			  Genotype population = Genotype.randomInitialGenotype( conf );
			  population.evolve();

			  //IChromosome bestSolutionSoFar;
			  for( int i = 0; i <4; i++ )
			  {
				  IChromosome bestSolutionSoFar = population.getFittestChromosome();
			  		System.out.println("Best so far.."+ bestSolutionSoFar.getFitnessValue());

			      population.evolve();
			  }

			   




		


	}

}
