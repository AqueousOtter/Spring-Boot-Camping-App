import React from 'react'
import "./Activities.css"

export default function Activities() {
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
      <div className="activities-section">
        <div className="activity-cards-section">
          <div className="activity-card-one activity-cards">
            <img src="./assets/img/sunset-boat.jpg" alt="sunset boating" />
            <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Eum rerum adipisci reiciendis 
              laboriosam deleniti eaque magnam nam consequuntur!</p>

          </div>
          <div className="activity-card-two activity-cards">
            <img src="./assets/img/trail-path.jpg" alt="trail path " />
            <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Eum rerum adipisci reiciendis 
              laboriosam deleniti eaque magnam nam consequuntur!</p>
          </div>
          <div className="activity-card-three activity-cards">
            <img src="./assets/img/kayak.jpg" alt="kayaks on lake" />
            <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Eum rerum adipisci reiciendis 
              laboriosam deleniti eaque magnam nam consequuntur!</p>

          </div>

        </div>
        <div className="summary">
          <p>
            Lorem ipsum dolor sit, amet consectetur adipisicing elit. 
            Impedit doloremque ullam velit ipsa veniam earum in fuga voluptatibus exercitationem tempora expedita quos facilis doloribus, debitis vitae. 
            Tempora consectetur ea animi? Lorem ipsum dolor sit, amet consectetur adipisicing elit. Ipsum, sint asperiores aliquam quos atque iusto suscipit
             voluptatibus cupiditate similique perspiciatis molestias architecto officia, fugit earum velit qui ad blanditiis. Id.
          </p>
        </div>
      </div>
      
    </div>
  )
}
