/**
 * 
 */
package com.eharmony.matching.vw.webservice.core;

/**
 * @author vrahimtoola
 * Submits examples to VW and returns predictions from it.
 */
public interface VWPredictor {

	/*
	 * Submits the examples to be evaluated, to VW.
	 * @param examples An iterable containing the VW examples. Must not be null (but can be empty). Null/empty examples returned by the iterable will be skipped.
	 * Before submitting to VW, each example string will be trimmed (on both ends) and then a newline will be tacked onto the end of each example before it is
	 * submitted to VW. 
	 * @returns The predictions, as generated by VW. May be empty, but never null. The strings in this iterable
	 * will be exactly as they've been returned by VW, no extra processing/massaging will be done.
	 */
	Iterable<String> predict(Iterable<String> examples);
}
