import React from 'react'
import './Contact.css'

export default function Contact() {
  return (
    <div className='contact-section'>
      <div className="contact-content">
        <div className="contact-form">
          <h3>Send us a message</h3>
          <p>We love to hear from you, we typically reply next day</p>
          <form action="">
            <label>
              <span>Name</span>
              <input type="text" id='name' placeholder='Full Name' />
            </label>
            <label>
              <span>Email</span>
              <input type="text" id='email' placeholder='email@address.com'/>
            </label>
        
            <label id='message'>
              <span>Message</span>
              <textarea rows="10" cols="38" name="message" id="" placeholder='Enter your message here' />
            </label>
            <button className='btn btn-success btn-lg'>Send</button>
          </form>
          
        </div>
        <div className="contact-container">
          <div className="contact-information">
            <h3>Contact Us</h3>
            <ul>
              <li>Office Hours</li>
              <li>Phone</li>
              <li>email</li>
              <li>facebook/instagram</li>
              <li>Address</li>
            
            </ul>
            <div className="gps-map">
              
            </div>
            <hr />
            <h4>connect with us</h4>
  
          <div className='contact-icons'>

            <img src="./assets/icons/facebook-icon.png" alt="facebook icon" className="facebook" />
            <img src="./assets/icons/instagram-icon.png" alt="instagram icon" className="instagram" />
          </div>

          </div>
          

        </div>
        
      </div>

    </div>
  )
}
