package me.surge.test

import me.surge.animation.*
import java.awt.Color
import java.math.BigDecimal
import java.math.RoundingMode

/**
 * @author Surge
 * @since 06/09/2022
 */
fun main() {
    /************** NORMAL **************/
    println("NORMAL ANIMATION")

    // Create animation object
    val animation = Animation({ 800f }, true, { Easing.CUBIC_OUT }, applyBothWays = true)

    // Set animation state
    animation.state = false

    // Get and print animation factor
    while (animation.getAnimationFactor() > 0.0) {
        println(animation.getAnimationFactor())
    }



    /************** BOUNDED **************/
    println("BOUNDED ANIMATION")

    // Create bounded animation object
    val bounded = BoundedAnimation(5f, 20f, 200f, false, Easing.LINEAR)

    // Set animation state
    bounded.state = true

    // Get and print animation factor
    while (bounded.getAnimationFactor() < bounded.maximum) {
        //println(bounded.getAnimationFactor())
    }



    /************** COLOUR **************/
    println("COLOUR ANIMATION")

    // Create bounded animation object
    val colourAnimation = ColourAnimation(Color.RED, Color.BLUE, 200f, false, Easing.LINEAR)

    // Set animation state
    colourAnimation.state = true

    // Get and print animation factor
    while (colourAnimation.getColour() != colourAnimation.to) {
        // Colour
        val colour = colourAnimation.getColour()

        //println("R ${colour.red} G ${colour.green} B ${colour.blue} A ${colour.alpha}")
    }
}