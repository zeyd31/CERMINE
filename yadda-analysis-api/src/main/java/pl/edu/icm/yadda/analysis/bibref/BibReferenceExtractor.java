package pl.edu.icm.yadda.analysis.bibref;

import pl.edu.icm.yadda.analysis.textr.model.BxDocument;

/**
 * Bibliographic reference extractor interface.
 *
 * @author Dominika Tkaczyk (d.tkaczyk@icm.edu.pl)
 */
public interface BibReferenceExtractor {

    public String[] extractBibReferences(BxDocument document);
}