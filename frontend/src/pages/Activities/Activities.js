import React from 'react'
import "./Activities.css"

export default function Activities() {
  return (
    <div>
      <div className="activities-section">
      <h2>Experiences</h2>
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
