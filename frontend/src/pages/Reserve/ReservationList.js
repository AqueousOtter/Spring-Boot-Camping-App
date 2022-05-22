import React from 'react'

export default function ReservationList({reservations}) {
  return (
      <div className="reservation-list">
        <table>
            <tr>
                <th>Site Number</th>
                <th>Arrival</th>
                <th>Departure</th>
                <th></th>
            </tr>
          {reservations.map(reservation => (

                  <tr key={reservation.siteNumber}>
                      <td>{reservation.siteNumber}</td>
                      <td>{reservation.startDate}</td>
                      <td>{reservation.endDate}</td>
                  </tr>
          
          ))}
          </table>



      </div>

  )
}
