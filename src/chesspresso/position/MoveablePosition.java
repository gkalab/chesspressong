/*
 * Copyright (C) Bernhard Seybold. All rights reserved.
 *
 * This software is published under the terms of the LGPL Software License,
 * a copy of which has been included with this distribution in the LICENSE.txt
 * file.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 *
 * $Id: MoveablePosition.java,v 1.1 2002/12/08 13:27:36 BerniMan Exp $
 */

package chesspresso.position;

import chesspresso.move.*;

/**
 *
 * @author $Author: BerniMan $
 * @version $Revision: 1.1 $
 */
public interface MoveablePosition extends MutablePosition
{
    void doMove(char move) throws IllegalMoveException;
    void doMove(Move move) throws IllegalMoveException;
    
    char getLastShortMove() throws IllegalMoveException;
    Move getLastMove() throws IllegalMoveException;
    
    boolean canUndoMove();
    boolean undoMove();
    
    boolean canRedoMove();
    boolean redoMove();
    
    char getMove(int from, int to, int promoPiece);
    
    char[] getAllMoves();
    String getMovesAsString(char[] moves, boolean validateEachMove);
}