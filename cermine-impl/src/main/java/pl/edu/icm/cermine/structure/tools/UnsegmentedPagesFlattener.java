/**
 * This file is part of CERMINE project.
 * Copyright (c) 2011-2018 ICM-UW
 *
 * CERMINE is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * CERMINE is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with CERMINE. If not, see <http://www.gnu.org/licenses/>.
 */

package pl.edu.icm.cermine.structure.tools;

import java.util.ArrayList;
import pl.edu.icm.cermine.structure.model.*;

/**
 * @author Dominika Tkaczyk (d.tkaczyk@icm.edu.pl)
 */
public class UnsegmentedPagesFlattener implements DocumentProcessor {

    @Override
    public void process(BxDocument document) {
        for (BxPage page: document) {
            for (BxZone zone: page) {
                for (BxChunk chunk : zone.getChunks()) {
                    page.addChunk(chunk);
                }
                for (BxLine line: zone) {
                    for (BxWord word: line) {
                        for (BxChunk chunk : word) {
                            page.addChunk(chunk);
                        }
                    }
                }
            }
            page.setZones(new ArrayList<BxZone>());
        }
    }

}
