import React from 'react'
import "./About.css"

export default function About() {
  console.log("about loaded")
  return (
    <div>
      <div className="feature-bar">
        <div className="feature-one">
          <img src="./assets/icons/forest-icon.svg" alt="tree icon" />
          <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Nisi eligendi.</p>
        </div>
        <div className="feature-two">
          <img src="./assets/icons/swim-icon.svg" alt="swimming icon" className="swim-icon" />
          <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Nisi eligendi.</p>
        </div>
        <div className="feature-three">
          <img src="./assets/icons/EV-icon.svg" alt="electric vehicle charing icon" className="ev-icon" />
          <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Nisi eligendi.</p>
        </div>
        <div className="feature-four">
          <img src="./assets/icons/pets-icon.svg" alt="pets allowed icon" className="pets-icon" />
          <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Nisi eligendi.</p>
        </div>
        <div className="feature-five">
          <img src="./assets/icons/plug-icon.svg" alt="electricity icon" className="electric-icon" />
          <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Nisi eligendi.</p>
        </div>


      </div>

      
      <div className="about-section">
        <div className="about-slideshow">
          <img src="./assets/img/swim-area.jpg" alt="swim area" className="slideshow" />
        </div>
        <div className="about-info">
          <h2>About us</h2>
          <p>Mattis eget ultrices, aenean morbi himenaeos elit curae. Blandit phasellus primis netus, velit nullam ante, 
            eros pharetra cubilia posuere id facilisis. Blandit cursus ut, condimentum aliquam nec varius eget. Etiam aliquam eros,
            interdum lorem, nunc fermentum magna neque consequat. Gravida eros inceptos, litora ipsum per habitant.</p>
        </div>
        
      </div>

    </div>
  )
}
