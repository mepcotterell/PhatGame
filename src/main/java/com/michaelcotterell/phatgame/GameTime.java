package com.michaelcotterell.phatgame;

import java.time.Duration;
import java.io.Serializable;

/**
 * Snapshot of the game timing state.
 *
 * @author Michael E. Cotterell
 * @since 0.1
 */
public class GameTime implements Serializable {

    protected Duration lastUpdate;
    protected Duration start;

    /**
     * Constructs a new GameTime object with values defaulted to zero.
     */
    public GameTime() {
	lastUpdate = Duration.ZERO;
	start      = Duration.ZERO;
    } // GameTime

    /**
     * Constructs a new GameTime object with the same 
     * {@link java.time.Duration} values that are contained in another 
     * {@link GameTime} object. This is a copy constructor.
     *
     * @param gameTime another {@link GameTime} object
     */
    public GameTime(GameTime gameTime) {
	lastUpdate = gameTime.lastUpdate;
	start      = gameTime.start;
    } // GameTime

    /**
     * Returns the amount of elapsed game time since the last update.
     *
     * @return game time since the last update
     */
    public Duration getElapsedGameTime() {
	return lastUpdate;
    } // getElapsedGameTime

    /**
     * Returns the amount of game time since the start of the game.
     *
     * @return elapsed game time since the start of the game
     */
    public Duration getTotalGameTime() {
	return start;
    } // getTotalGameTime

    /**
     * A string representation of this {@link GameTime} object using ISO-8601 
     * seconds based representations for the durations.
     */
    @Override
    public String toString() {
	return String.format("GameTime(lastUpdate = %s, start = %s)", lastUpdate, start);
    } // toString
    
} // GameTime

