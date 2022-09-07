import React from 'react'
import "./About.css"


export default function About() {
  console.log("about loaded")
  return (

      <div className="about-section">
        <div className="about-content">
        <div className="about-slideshow">
          <img src="./assets/img/swim-area.jpg" alt="swim area" className="slideshow" />
          <p>Swimming at Evergreen</p>
        </div>
        <div className="about-info">
          <h3>Our Story</h3>
          <p>Mattis eget ultrices, aenean morbi himenaeos elit curae. Blandit phasellus primis netus, velit nullam ante, 
            eros pharetra cubilia posuere id facilisis. Blandit cursus ut, condimentum aliquam nec varius eget. Etiam aliquam eros,
            interdum lorem, nunc fermentum magna neque consequat. Gravida eros inceptos, litora ipsum per habitant.</p>
            <p>Lorem, ipsum dolor sit amet consectetur. Lorem ipsum dolor sit amet consectetur adipisicing elit. 
              Exercitationem illum voluptate delectus odit quasi, eos aut, 
              perferendis iusto facilis ratione obcaecati praesentium molestias illo non voluptates assumenda quisquam eum soluta? adipisicing elit. Assumenda eos
               distinctio pariatur rerum nobis esse
              , cum dolorem hic harum corrupti quos ipsa delectus 
              atque maxime aspernatur tenetur provident illo et.</p>
        </div>
        </div>
        
        
      </div>

  )
}
